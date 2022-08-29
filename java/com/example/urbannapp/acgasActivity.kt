package com.example.urbannapp

import android.content.Intent
import android.content.SyncRequest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class acgasActivity : AppCompatActivity() {
    lateinit var request: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acgas)
        val request=findViewById<TextView>(R.id.request)
        request.setOnClickListener {
            val intent=Intent(this,acrequestActivity::class.java)
            startActivity(intent)
        }
        val recyclerview1 = findViewById<RecyclerView>(R.id.recyclerview1)

        // this creates a vertical layout Manager
        recyclerview1.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemViewModel2>()

        // This loop will create 20 Views containing
        // the image with the count of view

        data.add(ItemViewModel2(R.drawable.image16,"AC Gas Charging(<=1 Ton)","Avg. Price ₹2,699",R.drawable.tick,"Standard Gas Charging",R.drawable.tick,"Additional Cost of other services availed"))
        data.add(ItemViewModel2(R.drawable.image16,"AC Gas Charging(2 Ton)","Avg. Price ₹2,699",R.drawable.tick,"Standard Gas Charging",R.drawable.tick,"Additional Cost of other services availed"))
        data.add(ItemViewModel2(R.drawable.image16,"AC Gas Charging(1.5 Ton)","Avg. Price ₹2,699",R.drawable.tick,"Standard Gas Charging",R.drawable.tick,"Additional Cost of other services availed"))
        data.add(ItemViewModel2(R.drawable.image16,"AC Gas Charging(2.5 Ton)","Avg. Price ₹2,699",R.drawable.tick,"Standard Gas Charging",R.drawable.tick,"Additional Cost of other services availed"))

        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter2(data)

        // Setting the Adapter with the recyclerview
        recyclerview1.adapter = adapter
        }
    }




