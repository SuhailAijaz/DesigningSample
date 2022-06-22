package com.example.designingsample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView

class AdapterClass(private val list: List<Data>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    companion object{
        const val FirstRowData=1
        const val SecondRowData=2
        const val thirdad=3
        const val forthdata=4
        const val fifthdata=5
        const val sixthdata=6
        const val seventh=7
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        when (viewType) {
            FirstRowData -> {
                return (FirstRowViewHolder(LayoutInflater.from(parent.context)
                    .inflate(R.layout.first_row_viewholder, parent, false)))
            }
            SecondRowData->{
                return (SecondRowViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.second_row_recyclerview,parent,false)))
            }
            thirdad->{
                return (ThirdRowViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.thirdrow,parent,false)))
            }
            forthdata->{
                return (ForthRowViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.forth_row_recycleview,parent,false)))
            }
            fifthdata->{
                return (FifthRowViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.fifth_row_xm,parent,false)))
            }
            sixthdata->{
                return (SixthRowViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.sixth_layout,parent,false)))
            }
                seventh->{
                    return (SeventhRowViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.seventh_row,parent,false)))

                }
            else -> {
                return (ThirdRowViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.thirdrow,parent,false)))
            }
        }
    }


// Basic idea whenusing if else
//        if (viewType == FirstRowData) {
//            return (FirstRowViewHolder(LayoutInflater.from(parent.context)
//                .inflate(R.layout.first_row_viewholder, parent, false)))
//        } else if (viewType == SecondRowData) {
//            return (SecondRowViewHolder(LayoutInflater.from(parent.context)
//                .inflate(R.layout.second_row_recyclerview, parent, false)))
//        } else if (viewType == thirdad) {
//            return (ThirdRowViewHolder(LayoutInflater.from(parent.context)
//                .inflate(R.layout.thirdrow, parent, false)))
//        }




    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
if(holder is FirstRowViewHolder){

}
    }

    override fun getItemCount(): Int {
return list.size
    }

    override fun getItemViewType(position: Int): Int {
        return list[position].viewtype
    }

    // for second row
    inner class SecondRowViewHolder(itemview: View):RecyclerView.ViewHolder(itemview) {
        private val recyclerView: RecyclerView
        private val madapter by lazy {
            SecondRowAdapter()
        }
        private val snapHelper = PagerSnapHelper()

        init {
            recyclerView = itemview.findViewById(R.id.secondrowrecycler)

            recyclerView.apply {
                snapHelper.attachToRecyclerView(this)
                layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
                adapter = madapter
            }
        }
    }
        inner class ForthRowViewHolder(itemview:View):RecyclerView.ViewHolder(itemview){
           private val recyclerView:RecyclerView
           private val madapter by lazy {
               ForthRowAdapter()
           }
            private val snapHelper=PagerSnapHelper()
            init {
                recyclerView=itemview.findViewById(R.id.rxview)
                recyclerView.apply {
                    snapHelper.attachToRecyclerView(this)
                    setHasFixedSize(true)
                    layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
                    adapter=madapter
                }
            }

        }
    }
