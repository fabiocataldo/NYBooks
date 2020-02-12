package com.example.nybooks.presentation.books

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nybooks.R
import com.example.nybooks.data.model.DataBook
import kotlinx.android.synthetic.main.activity_books.*

class BooksActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        //function "with" allow you to go inside the layout and get his components

        with(recyclerView){
            layoutManager = LinearLayoutManager(this@BooksActivity, RecyclerView.VERTICAL, false)
            adapter = BooksAdapter(getBooks())
        }
    }

    // function to populate manually while my API its not functional

    fun getBooks(): List<DataBook>{
        return  listOf(
            DataBook("Titulo 1", "Autor 1"),
            DataBook("Titulo 2", "Autor 2"),
            DataBook("Titulo 3", "Autor 3")
        )
    }
}
