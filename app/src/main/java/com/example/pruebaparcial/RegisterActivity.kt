package com.example.pruebaparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val register_btn = findViewById<Button>(R.id.register_btn)

        register_btn.setOnClickListener(){
            val menuWindow = Intent(this, MenuActivity::class.java)
            startActivity(menuWindow)
        }

        val login_btn = findViewById<Button>(R.id.backtologin_btn)

        login_btn.setOnClickListener(){
            val loginWindow = Intent(this, LoginActivity::class.java)
            startActivity(loginWindow)
        }
    }
}