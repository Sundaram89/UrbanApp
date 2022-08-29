package com.example.urbannapp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class otpvarificationActivity : AppCompatActivity() {
    lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otpvarification)
        btn=findViewById(R.id.btn2)
        btn.setOnClickListener{
            val intent= Intent(this,locationActivity::class.java)
            startActivity(intent)
        }
    }
}