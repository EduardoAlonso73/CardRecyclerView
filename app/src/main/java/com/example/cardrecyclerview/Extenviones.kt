package com.example.cardrecyclerview
import android.widget.SearchView
import android.widget.Toast
import java.util.*

fun SearchView.searchBook(cardAdapter: CardAdapter){

    this.setOnQueryTextListener( object : SearchView.OnQueryTextListener{
        override fun onQueryTextSubmit(p0: String?): Boolean = true
        override fun onQueryTextChange(msg: String): Boolean {

            val filterersProduct:MutableList<Book> = mutableListOf()
            for (item in ProviderBook.readBooks()) {
                if (item.title.lowercase(Locale.getDefault()).contains(msg.lowercase(Locale.getDefault()))) {
                    filterersProduct.add(item)
                }
            }
            println("=========="+ProviderBook.readBooks().size+"========")
            if (filterersProduct.isEmpty()) {
                Toast.makeText(context, "No Data Found..", Toast.LENGTH_SHORT).show()
            } else { cardAdapter.filterList(filterersProduct) }

            return false
        }
    })
}
