package com.example.designingsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recycleMain: RecyclerView
    private val mAdapter by lazy {
AdapterClass(listOf(Data(1,"First"),Data(2,"Second"),
Data(3,"Third"),Data(4,"Forth"), Data(5,"fifth"),
Data(6,"sixth"),Data(7,"seventh")))
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycleMain=findViewById(R.id.recycleMain)
        recycleMain.apply {
            setHasFixedSize(true)
            layoutManager=LinearLayoutManager(this@MainActivity)
            adapter=mAdapter
        }

    }
}