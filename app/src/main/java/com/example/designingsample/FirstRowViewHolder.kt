package com.example.designingsample

import android.view.View
import android.widget.SearchView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FirstRowViewHolder(itemview: View):RecyclerView.ViewHolder(itemview) {
    val t1: TextView
    val search: SearchView
    init {
        t1=     itemview.findViewById(R.id.t1)
        search= itemview.findViewById(R.id.t2)
    }
}