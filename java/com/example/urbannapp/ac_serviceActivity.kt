package com.example.urbannapp



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class ac_serviceActivity : AppCompatActivity() {
    lateinit var arrow:ImageView
    lateinit var selectneed:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ac_service)
        selectneed=findViewById<TextView>(R.id.selectneed)
        selectneed.setOnClickListener {
             val intent =Intent(this,acgasActivity::class.java)
            startActivity(intent)
        }
        arrow=findViewById<ImageView>(R.id.arrow)
        arrow.setOnClickListener {
            val intent=Intent(this,homeActivity::class.java)
            startActivity(intent)
        }
        val imageSlider = findViewById<ImageSlider>(R.id.imgslider1)
        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel("https://mcdn.wallpapersafari.com/medium/39/47/eT1U8v.jpg"))
        imageList.add(SlideModel("https://mcdn.wallpapersafari.com/medium/39/47/eT1U8v.jpg"))
        imageList.add(SlideModel("https://mcdn.wallpapersafari.com/medium/39/47/eT1U8v.jpg"))
        imageList.add(SlideModel("https://mcdn.wallpapersafari.com/medium/39/47/eT1U8v.jpg"))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)
        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager =LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()

        // This loop will create 20 Views containing
        // the image with the count of view

        data.add(ItemsViewModel(R.drawable.acgas,"AC Gas Charging",R.drawable.symbol))
        data.add(ItemsViewModel(R.drawable.acservice,"AC Service",R.drawable.symbol))
        data.add(ItemsViewModel(R.drawable.acrepair,"AC Repair",R.drawable.symbol))
        data.add(ItemsViewModel(R.drawable.acinstall,"AC Installation\n" +
                "Uninstallation",R.drawable.symbol))

        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter
        



    }
}

