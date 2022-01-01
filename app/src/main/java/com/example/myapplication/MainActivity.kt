package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.util.Log
//import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val listOfTasks = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        findViewById<Button>(R.id.button).setOnClickListener {
//            // code here will be executed when btn is clicked
//            Log.i("messageHere", "hello world")
//        }

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val adapter = TaskItemAdapter(listOfTasks)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}