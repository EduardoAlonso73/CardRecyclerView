package com.example.cardrecyclerview

//val bookList = mutableListOf<Book>()

 const val BOOK_ID_EXTRA = "bookExtra"

 data class Book(
    var cover: String,
    var author: String,
    var title: String,
    var description: String,
    val id: Int
)