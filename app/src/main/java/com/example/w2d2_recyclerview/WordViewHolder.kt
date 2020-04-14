package com.example.w2d2_recyclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class WordViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(text: String, clickListener: (String) -> Unit) {
        itemView.wordTxt.text = text
        itemView.setOnClickListener { clickListener(text)}
    }

}