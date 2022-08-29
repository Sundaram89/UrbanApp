package com.example.urbannapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter3(private val mList: List<ItemsViewModel3>) : RecyclerView.Adapter<CustomAdapter3.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.notification_view_design, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel3 = mList[position]

        // sets the image to the imageview from our itemHolder class
        holder.img1.setImageResource(ItemsViewModel3.image4)

        // sets the text to the textview from our itemHolder class
        holder.txt1.text = ItemsViewModel3.txt1
        holder.txt2.text = ItemsViewModel3.txt2
        holder.txt3.text = ItemsViewModel3.txt3
        holder.txt4.text = ItemsViewModel3.txt4
        holder.txt5.text = ItemsViewModel3.txt5
        holder.txt6.text = ItemsViewModel3.txt6
        holder.txt7.text = ItemsViewModel3.txt7
        holder.txt8.text = ItemsViewModel3.txt8




    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val img1: ImageView = itemView.findViewById(R.id.img1)
        val txt1: TextView = itemView.findViewById(R.id.txt1)
        val txt2: TextView = itemView.findViewById(R.id.txt2)
        val txt3: TextView = itemView.findViewById(R.id.txt3)
        val txt4: TextView = itemView.findViewById(R.id.txt4)
        val txt5: TextView = itemView.findViewById(R.id.txt5)
        val txt6: TextView = itemView.findViewById(R.id.txt6)
        val txt7: TextView = itemView.findViewById(R.id.txt7)
        val txt8: TextView = itemView.findViewById(R.id.txt8)
        val btn4:Button=itemView.findViewById(R.id.btn4)
        val btn5:Button=itemView.findViewById(R.id.btn5)

    }
}