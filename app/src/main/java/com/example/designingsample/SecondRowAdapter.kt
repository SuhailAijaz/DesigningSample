package com.example.designingsample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SecondRowAdapter:RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return SecondRowViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.second_row,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
if(holder is SecondRowViewHolder){

}
    }

    override fun getItemCount(): Int {
return 10
    }
}