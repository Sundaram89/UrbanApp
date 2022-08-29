package com.example.urbannapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.urbannapp.R

class notificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)
        val recyclerview3 = findViewById<RecyclerView>(R.id.recyclerview3)
        recyclerview3.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<ItemsViewModel3>()
        data.add(ItemsViewModel3(R.drawable.man,"Mr.Kumar rao","Gas Filler",". 2 year Experience",". 2 year Experience","2min ago","Date of Availibilty","Today","₹2,399"))
        data.add(ItemsViewModel3(R.drawable.man,"Mr.Kumar rao","Gas Filler",". 2 year Experience",". 2 year Experience","2min ago","Date of Availibilty","Today","₹2,399"))
        data.add(ItemsViewModel3(R.drawable.man,"Mr.Kumar rao","Gas Filler",". 2 year Experience",". 2 year Experience","2min ago","Date of Availibilty","Today","₹2,399"))
        data.add(ItemsViewModel3(R.drawable.man,"Mr.Kumar rao","Gas Filler",". 2 year Experience",". 2 year Experience","2min ago","Date of Availibilty","Today","₹2,399"))
        val adapter = CustomAdapter3(data)

        // Setting the Adapter with the recyclerview
        recyclerview3.adapter = adapter
    }
}