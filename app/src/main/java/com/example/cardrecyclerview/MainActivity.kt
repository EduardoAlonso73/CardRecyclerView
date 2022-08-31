package com.example.cardrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.example.cardrecyclerview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), BookClickListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var cardAdapter: CardAdapter

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupRecyclerView()
        binding.searchView.searchBook(cardAdapter)

    }

    override fun onClick(book: Book) {
        val intent = Intent(applicationContext, DetailActivity::class.java)
        intent.putExtra(BOOK_ID_EXTRA, book.id)
        Toast.makeText(this, book.id.toString(), Toast.LENGTH_SHORT).show()
        startActivity(intent)
    }

    private fun setupRecyclerView(){
        cardAdapter = CardAdapter(ProviderBook.bookList, this)
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 2)
            adapter=cardAdapter
        }
    }

}