package com.example.designingsample

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.chip.Chip

class SecondRowViewHolder(itemview: View):RecyclerView.ViewHolder(itemview) {

    val chip:Chip
    val chip2:Chip
    val chip3:Chip
    val chipfour:Chip
    val chipfive:Chip
    val chipsix:Chip
    val chipseven:Chip
    init {
        chip=itemview.findViewById(R.id.chipone)
        chip2=itemview.findViewById(R.id.chiptwo)
        chip3=itemview.findViewById(R.id.chipthree)
        chipfour=itemview.findViewById(R.id.chipfour)
        chipfive=itemview.findViewById(R.id.chipfive)
        chipsix=itemview.findViewById(R.id.chipsix)
        chipseven=itemview.findViewById(R.id.chipseven)

    }
}