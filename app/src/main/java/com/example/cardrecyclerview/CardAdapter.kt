package com.example.cardrecyclerview

import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.target.CustomTarget
import com.example.cardrecyclerview.databinding.CardCellBinding


class CardAdapter(private var books: MutableList<Book>, private val clickListener: MovieClickListener)
    : RecyclerView.Adapter<CardAdapter.BooksViewHolder>() {
    lateinit var mContext:Context


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        mContext=parent.context
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_cell, parent, false)
        return BooksViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int)
    {
        val positionItemCard= books[position]
        loadImg(holder.mBinding,positionItemCard)
        with(holder){
            render(positionItemCard)
            mBinding.title.text = positionItemCard.title
            mBinding.author.text = positionItemCard.author
        }

    }

   fun filterList(entryPrd: MutableList<Book>) {
        books = entryPrd
        notifyDataSetChanged()
    }

    private fun loadImg(mBinding: CardCellBinding, posiItemCard:Book){
        Glide.with(mBinding.root.context)
            .asBitmap()
            .diskCacheStrategy(DiskCacheStrategy.NONE)
            .centerCrop()
            .load(posiItemCard.cover)
            .into(object: CustomTarget<Bitmap>(1280,1720){
                override fun onResourceReady(resource: Bitmap, transition: com.bumptech.glide.request.transition.Transition<in Bitmap>?) {
                    mBinding.progressBar.visibility= View.GONE
                    mBinding.cover.scaleType= ImageView.ScaleType.CENTER_CROP
                    mBinding.cover.setImageBitmap(resource)
                }

                override fun onLoadStarted(placeholder: Drawable?) {
                    super.onLoadStarted(placeholder)
                    mBinding.cover.scaleType= ImageView.ScaleType.CENTER_INSIDE
                    mBinding.cover.setImageResource(R.drawable.ic_access_time)
                }

                override fun onLoadFailed(errorDrawable: Drawable?) {
                    super.onLoadFailed(errorDrawable)
                    mBinding.progressBar.visibility= View.GONE
                    mBinding.cover.scaleType= ImageView.ScaleType.CENTER_INSIDE
                    mBinding.cover.setImageResource(R.drawable.ic_broken_image)
                }
                override fun onLoadCleared(placeholder: Drawable?) {}

            })

    }


    override fun getItemCount(): Int = books.size

    /*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
          ----------- VIEW HOLDER ------------
  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* */

    inner  class BooksViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val mBinding=CardCellBinding.bind(itemView)
        fun render(books:Book){
            mBinding.root.setOnClickListener{ clickListener.onClick(books) }
        }
    }

}