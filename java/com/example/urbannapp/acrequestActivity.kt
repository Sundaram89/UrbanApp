package com.example.urbannapp

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.widget.TextView

class acrequestActivity : AppCompatActivity() {
    lateinit var button3: Button
    lateinit var request1:TextView
    lateinit var mdialog:Dialog
    lateinit var imageView:ImageView
    lateinit var loadpicture:ImageView
    private val pickImage = 100
    private var imageUri: Uri? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acrequest)
        request1=findViewById<TextView>(R.id.request1)
        request1.setOnClickListener {
            val intent= Intent(this,notificationActivity::class.java)
            startActivity(intent)
        }
        button3=findViewById(R.id.button3)
        mdialog=Dialog(this)
        button3.setOnClickListener {
            mdialog.setContentView(R.layout.popup)

            mdialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            mdialog.show()
        }

        imageView = findViewById(R.id.imageView)
        loadpicture = findViewById(R.id.loadpicture)
        loadpicture.setOnClickListener {
            val gallery = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
            startActivityForResult(gallery, pickImage)
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK && requestCode == pickImage) {
            imageUri = data?.data
            imageView.setImageURI(imageUri)
        }
    }
}