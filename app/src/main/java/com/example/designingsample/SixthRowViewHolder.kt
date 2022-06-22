package com.example.designingsample

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SixthRowViewHolder(itemview: View):RecyclerView.ViewHolder(itemview) {
    val img:ImageView
    val txt:TextView
    val txt2:TextView
    val txt3:TextView

    init {
        img=itemview.findViewById(R.id.imageview)
        txt=itemview.findViewById(R.id.uxtextview)
        txt2=itemview.findViewById(R.id.textUxDEsign)
        txt3=itemview.findViewById(R.id.textviewCircle)



    }
}