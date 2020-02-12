package com.example.nybooks.presentation.books

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nybooks.R
import com.example.nybooks.data.model.DataBook
import kotlinx.android.synthetic.main.item_book.view.*

// Creating an adapter to control the population of recyclerView

class BooksAdapter(private val books: List<DataBook>) :
    RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false)
        return BooksViewHolder(view)
    }
    override fun getItemCount() = books.count()

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
        holder.bindView(books[position])
    }
    class BooksViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val title = view.titleTV
        private val author = view.authorTV

        fun bindView(book: DataBook) {

            title.text = book.title
            author.text = book.author

        }
    }
}