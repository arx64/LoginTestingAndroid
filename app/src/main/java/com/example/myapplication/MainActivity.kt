package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val loginButton: Button = findViewById(R.id.buttonLogin)
        val regisButton: Button = findViewById(R.id.buttonSignup)
        loginButton.setOnClickListener {
//            panggil fungsi untuk melakukan login
            performLogin()
        }
        regisButton.setOnClickListener {
//            panggil fungsi untuk melakukan login
            performRegister()
        }
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }

    fun performLogin() {
//        val retrofit = Retrofit.Builder()
        Toast.makeText(applicationContext, "Success Login!", Toast.LENGTH_SHORT).show()
    }
    fun performRegister() {
//        val retrofit = Retrofit.Builder()
        Toast.makeText(applicationContext, "Success Register!", Toast.LENGTH_SHORT).show()
    }
}