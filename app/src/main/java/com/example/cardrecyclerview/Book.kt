package com.example.cardrecyclerview

val bookList = mutableListOf<Book>()

 val BOOK_ID_EXTRA = "bookExtra"

 data class Book(
    var cover: Int,
    var author: String,
    var title: String,
    var description: String,
    val id: Int? = bookList.size
)