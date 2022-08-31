package com.example.cardrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cardrecyclerview.databinding.CardCellBinding


class CardAdapter(private var books: MutableList<Book>, private val clickListener: BookClickListener)
    : RecyclerView.Adapter<CardAdapter.BooksViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder
    {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_cell, parent, false)
        return BooksViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int)
    {
        val positionItemCard= books[position]
        with(holder){
            render(positionItemCard)
            mBinding.cover.setImageResource(positionItemCard.cover)
            mBinding.title.text = positionItemCard.title
            mBinding.author.text = positionItemCard.author
        }

    }

   fun filterList(entryPrd: MutableList<Book>) {
        books = entryPrd
        notifyDataSetChanged()
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