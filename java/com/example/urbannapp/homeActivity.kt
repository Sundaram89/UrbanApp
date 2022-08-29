package com.example.urbannapp



import Fragement.bookingFragment
import Fragement.homeFragment
import Fragement.mapFragment
import android.content.ClipData
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.SearchView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class homeActivity : AppCompatActivity() {
    private val homeFragement = homeFragment()
    private val bookingFragement = bookingFragment()
    private val mapFragement = mapFragment()
    private val profileFragment = Fragement.profileFragment()
    lateinit var gridView: GridView
    private var playerNames =
        arrayOf("Electricity",
            "Plumbing",
            "Washing",
            "Flooring",
            "Beauty",
            "Ac Services",
            "Cleaning",
            "Flooring",
            "Beauty",
            "Plumbing",
            "Washing",
            "flooring")
    private var playerImages = intArrayOf(R.drawable.socket,
        R.drawable.spanner,
        R.drawable.washingmachine,
        R.drawable.floor,
        R.drawable.cosmetics,
        R.drawable.airconditioner1,
        R.drawable.vacuumcleaner,
        R.drawable.floor,
        R.drawable.washingmachine,
        R.drawable.spanner,
        R.drawable.washingmachine,
        R.drawable.floor)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)
        replaceFragement(homeFragement)
        val imageSlider = findViewById<ImageSlider>(R.id.imgslider)
        var imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel("https://mcdn.wallpapersafari.com/medium/39/47/eT1U8v.jpg"))
        imageList.add(SlideModel("https://mcdn.wallpapersafari.com/medium/39/47/eT1U8v.jpg"))
        imageList.add(SlideModel("https://mcdn.wallpapersafari.com/medium/39/47/eT1U8v.jpg"))
        imageList.add(SlideModel("https://mcdn.wallpapersafari.com/medium/39/47/eT1U8v.jpg"))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)


        gridView = findViewById(R.id.gridView)
        val mainAdapter = MainAdapter(this@homeActivity, playerNames, playerImages)
        gridView.adapter = mainAdapter
        gridView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
//            Toast.makeText(applicationContext, "You CLicked " + playerNames[+position],
//                Toast.LENGTH_SHORT).show()
            val intent =Intent(this,ac_serviceActivity::class.java)
            startActivity(intent)
        }
       
    }


    private fun replaceFragement(fragement: Fragment) {
        if (fragement !== null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.commit()
        }
    }
}