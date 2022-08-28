package com.example.cardrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import code.with.cal.cardviewrecyclerviewtutorial.*
import com.example.cardrecyclerview.databinding.ActivityMainBinding
import java.util.*

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
        Toast.makeText(this, "ssss", Toast.LENGTH_SHORT).show()
        startActivity(intent)
    }

    private fun setupRecyclerView(){
        cardAdapter = CardAdapter(ProviderBook.populateBooks(), this)
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 2)
            adapter=cardAdapter
        }
    }





}