package com.example.urbannapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CustomAdapter2(private val mList: List<ItemViewModel2>) : RecyclerView.Adapter<CustomAdapter2.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.accard_view_design, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemViewModel2 = mList[position]

        // sets the image to the imageview from our itemHolder class
        holder.imageView1.setImageResource(ItemViewModel2.image1)

        // sets the text to the textview from our itemHolder class
        holder.textView1.text = ItemViewModel2.text1
        holder.textView2.text=ItemViewModel2.text2.toString()
        holder.imageView2.setImageResource(ItemViewModel2.image2)
        holder.textView3.text=ItemViewModel2.text3
        holder.imageView3.setImageResource(ItemViewModel2.image3)
        holder.textView.text=ItemViewModel2.text4


    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView1: ImageView = itemView.findViewById(R.id.imageView1)
        val textView1: TextView = itemView.findViewById(R.id.textView1)
        val textView2: TextView=itemView.findViewById(R.id.textView2)
        val imageView2:ImageView=itemView.findViewById(R.id.imageView2)
        val textView3:TextView=itemView.findViewById(R.id.textview3)
        val imageView3:ImageView=itemView.findViewById(R.id.imageView3)
        val textView:TextView=itemView.findViewById(R.id.textview4)
        val button: Button =itemView.findViewById(R.id.button1)
    }
}