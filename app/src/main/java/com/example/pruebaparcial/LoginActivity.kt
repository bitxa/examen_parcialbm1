package com.example.pruebaparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val register_btn = findViewById<Button>(R.id.gotoregister_btn)
        val login_btn = findViewById<Button>(R.id.login_btn)

        register_btn.setOnClickListener(){
            val registerWindow = Intent(this, RegisterActivity::class.java)
            startActivity(registerWindow)
        }

        login_btn.setOnClickListener(){
            val menuWindow = Intent(this, MenuActivity::class.java)
            startActivity(menuWindow)
        }
    }
}