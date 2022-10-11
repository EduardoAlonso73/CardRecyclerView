package com.example.cardrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.cardrecyclerview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), MovieClickListener {
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
        val arg=Bundle()
        arg.putLong(getString(R.string.arg_id),book.id.toLong())
        launchViewFragment(arg)

      /*  val intent = Intent(applicationContext, DetailActivity::class.java)
        intent.putExtra(BOOK_ID_EXTRA, book.id)
        Toast.makeText(this, book.id.toString(), Toast.LENGTH_SHORT).show()
        startActivity(intent)*/
    }


    private fun launchViewFragment(args: Bundle?=null) {
        val fragmentView=DetaitFragment()
        if(args!=null)fragmentView.arguments=args
        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.containerMain,fragmentView)
        fragmentTransaction.addToBackStack(null)// Me permite regresar al main activity
        fragmentTransaction.commit()
    }


    private fun setupRecyclerView(){
        cardAdapter = CardAdapter(ProviderMovie.bookList, this)
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 2)
            adapter=cardAdapter
        }
    }

}