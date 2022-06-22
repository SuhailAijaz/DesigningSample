package com.example.designingsample

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FifthRowViewHolder(itemview: View):RecyclerView.ViewHolder(itemview) {
    val textfirst:TextView
    val textsec:TextView
    init {
        textfirst=itemview.findViewById(R.id.populartextView)
        textsec=itemview.findViewById(R.id.seeAllTextView)

    }
}