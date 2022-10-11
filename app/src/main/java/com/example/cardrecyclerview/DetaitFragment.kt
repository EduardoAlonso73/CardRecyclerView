package com.example.cardrecyclerview

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.target.CustomTarget
import com.example.cardrecyclerview.databinding.ActivityDetailBinding
import com.example.cardrecyclerview.databinding.ActivityMainBinding

class DetaitFragment : Fragment() {
    lateinit var  mBinding: ActivityDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        mBinding= ActivityDetailBinding.inflate(inflater,container,false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val id=arguments?.getLong(getString(R.string.arg_id),0)

        val book = id?.isNoNull()
        if(book != null) {
            loadImg(book)
            with(mBinding){
                title.text = book.title
                description.text = book.description
                author.text = book.author
            }

        }

    }


    private  fun  loadImg( data:Book){
        Glide.with(mBinding.root.context)
            .asBitmap()
            .diskCacheStrategy(DiskCacheStrategy.NONE)
            .centerCrop()
            .load(data.cover)
            .into(object: CustomTarget<Bitmap>(1280,1720){
                override fun onResourceReady(resource: Bitmap, transition: com.bumptech.glide.request.transition.Transition<in Bitmap>?) {
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
                    mBinding.cover.scaleType= ImageView.ScaleType.CENTER_INSIDE
                    mBinding.cover.setImageResource(R.drawable.ic_broken_image)
                }
                override fun onLoadCleared(placeholder: Drawable?) {}

            })

    }

   private fun Long.isNoNull(): Book?{
       ProviderMovie.bookList.forEach { book -> if (book.id.toLong() == this) return book }
       return null
    }

}