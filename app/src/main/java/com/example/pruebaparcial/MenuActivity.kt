package com.example.pruebaparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        val gotogallery_btn = findViewById<Button>(R.id.gotogallery_btn)

        gotogallery_btn.setOnClickListener(){
            val galleryActivity = Intent(this, GalleryActivity::class.java)
            startActivity(galleryActivity)
        }

        val login_btn = findViewById<Button>(R.id.close)
        login_btn.setOnClickListener(){
            val loginWindow = Intent(this, LoginActivity::class.java)
            startActivity(loginWindow)
        }

    }
}