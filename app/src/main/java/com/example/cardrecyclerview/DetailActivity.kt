package com.example.cardrecyclerview

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.target.CustomTarget
import com.example.cardrecyclerview.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bookID = intent.getIntExtra(BOOK_ID_EXTRA, -1)
        val book = bookFromID(bookID)
        if(book != null)
        {
            Glide.with(binding.root.context)
                .asBitmap()
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .centerCrop()
                .load(book.cover)
                .into(object: CustomTarget<Bitmap>(1280,1700){
                    override fun onResourceReady(resource: Bitmap, transition: com.bumptech.glide.request.transition.Transition<in Bitmap>?) {

                        binding.cover.scaleType= ImageView.ScaleType.CENTER_CROP
                        binding.cover.setImageBitmap(resource)
                    }

                    override fun onLoadStarted(placeholder: Drawable?) {
                        super.onLoadStarted(placeholder)
                        binding.cover.scaleType= ImageView.ScaleType.CENTER_INSIDE
                        binding.cover.setImageResource(R.drawable.ic_access_time)
                    }

                    override fun onLoadFailed(errorDrawable: Drawable?) {
                        super.onLoadFailed(errorDrawable)

                        binding.cover.scaleType= ImageView.ScaleType.CENTER_INSIDE
                        binding.cover.setImageResource(R.drawable.ic_broken_image)
                    }
                    override fun onLoadCleared(placeholder: Drawable?) {}

                })
            binding.title.text = book.title
            binding.description.text = book.description
            binding.author.text = book.author
        }
    }

    private fun bookFromID(bookID: Int): Book?
    {
        for(book in ProviderMovie.bookList)
        {
            if(book.id == bookID) return  book
        }
        return null
    }
}