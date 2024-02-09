package com.example.sis2109_feb09_tuleuov_aman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.provider.MediaStore
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnBio= findViewById<Button>(R.id.button2)
        btnBio.setOnClickListener {
            intent= Intent(applicationContext, Second_Screen::class.java)
            startActivity(intent)
        }
        val btnprofile= findViewById<Button>(R.id.button3)
        btnprofile.setOnClickListener {
            val newlink= Intent(Intent.ACTION_VIEW)
            newlink.data= Uri.parse("https://www.youtube.com/@IShowSpeed")
            startActivity(newlink)
        }
        val btncamera= findViewById<Button>(R.id.button4)
        btncamera.setOnClickListener {
            val opencamera= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(opencamera)
        }
    }
}