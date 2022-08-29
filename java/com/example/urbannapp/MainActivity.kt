package com.example.urbannapp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn=findViewById(R.id.btn1)
        btn.setOnClickListener{
            val intent = Intent(this, otpvarificationActivity::class.java)
            startActivity(intent)
        }
    }
}
