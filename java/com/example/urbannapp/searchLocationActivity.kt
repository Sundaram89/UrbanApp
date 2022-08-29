package com.example.urbannapp



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.ArrayList

class searchLocationActivity : AppCompatActivity() {
    lateinit var listView: ListView
    lateinit var textView: TextView
    lateinit var icon: ImageView
    lateinit var searchView: SearchView
    var list: ArrayList<String>? = null
    var adapter: ArrayAdapter<String>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_location)
        icon=findViewById(R.id.icon)
        icon.setOnClickListener {
            val intent = Intent(this, locationActivity::class.java)
            startActivity(intent)
        }
        listView = findViewById(R.id.listView)

        val mobileArray= arrayOf("Lingampally Railway Station PF:3,\n" +
                "Serilingampalle (M), Telangana ","Lingampally Railway Station PF:3,\n" +
                "Serilingampalle (M), Telangana ","Lingampally Railway Station PF:3,\n" +
                "Serilingampalle (M), Telangana ","Lingampally Railway Station PF:3,\n" +
                "Serilingampalle (M), Telangana ","Lingampally Railway Station PF:3,\n" +
                "Serilingampalle (M), Telangana ")
        val adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,mobileArray)
        listView.adapter=adapter

        listView.onItemClickListener= AdapterView.OnItemClickListener()
        {_, _, position, _ ->
            val intent = Intent(this, homeActivity::class.java)
            startActivity(intent)
        }


        searchView = findViewById(R.id.searchView)
        searchView.setOnQueryTextListener(object :SearchView.OnQueryTextListener{
            override fun onQueryTextChange(query: String?): Boolean {
                if(mobileArray!!.contains(query))
                {
                    adapter!!.filter.filter(query)
                }
                else{
                    Toast.makeText(applicationContext,"No Match",Toast.LENGTH_LONG).show()
                }
                return false
            }

            override fun onQueryTextSubmit(newText: String?): Boolean {
                adapter!!.getFilter().filter(newText);
                return false
            }

        })



    }

}