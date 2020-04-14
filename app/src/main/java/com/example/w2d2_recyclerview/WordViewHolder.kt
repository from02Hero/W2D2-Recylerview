package com.example.w2d2_recyclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class WordViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(word: Word, clickListener: (String) -> Unit) {
        itemView.wordTxt.text = word.text
        itemView.setOnClickListener { word.text?.let { it1 -> clickListener(it1) } }
    }

}