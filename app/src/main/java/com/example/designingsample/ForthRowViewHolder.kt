package com.example.designingsample

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ForthRowViewHolder(itemview:View):RecyclerView.ViewHolder(itemview) {
    val imageview:ImageView
    val globetxt:TextView
    val globebelo:TextView
    val newtext:TextView
    init {
        imageview=itemview.findViewById(R.id.imageone)
        globetxt=itemview.findViewById(R.id.textDownGlobe)
        globebelo=itemview.findViewById(R.id.textUxDEsign)
        newtext=itemview.findViewById(R.id.textviewCircle)
    }
}