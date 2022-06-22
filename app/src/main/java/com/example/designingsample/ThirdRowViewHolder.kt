package com.example.designingsample

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class ThirdRowViewHolder(iv:View):RecyclerView.ViewHolder(iv) {

    val populartext:TextView
    val seeText:TextView
    init {
        populartext=iv.findViewById(R.id.populartextView)
      seeText=iv.findViewById(R.id.seeAllTextView)
    }
}