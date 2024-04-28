package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
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
        val emailText: TextView = findViewById(R.id.emailText)
        val passwordText: TextView = findViewById(R.id.passwordText)
        val regisButton: Button = findViewById(R.id.buttonSignup)

        fun performLogin() {
            val email = emailText.text.toString() // Ambil teks dari TextView
            val password = passwordText.text.toString() // Ambil teks dari TextView

            Toast.makeText(applicationContext, "mencoba masuk dengan ${email} dan ${password}", Toast.LENGTH_SHORT).show()
            if (email.isEmpty()) {
                Toast.makeText(applicationContext, "Email tidak boleh kosong!", Toast.LENGTH_SHORT).show()
            }
            if (password.isEmpty()) {
                Toast.makeText(applicationContext, "Password tidak boleh kosong!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Success Login!", Toast.LENGTH_SHORT).show()
            }
        }

        fun performRegister() {
            val email = emailText.text.toString() // Ambil teks dari TextView
            val password = passwordText.text.toString() // Ambil teks dari TextView

            Toast.makeText(applicationContext, "mencoba register dengan $email dan $password", Toast.LENGTH_SHORT).show()
            if (email.isEmpty()) {
                Toast.makeText(applicationContext, "Email tidak boleh kosong!", Toast.LENGTH_SHORT).show()
            }
            if (password.isEmpty()) {
                Toast.makeText(applicationContext, "Password tidak boleh kosong!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Success Register!", Toast.LENGTH_SHORT).show()
            }
        }

        loginButton.setOnClickListener {
            // panggil fungsi untuk melakukan login
            performLogin()
        }
        regisButton.setOnClickListener {
            // panggil fungsi untuk melakukan login
            performRegister()
        }

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }
}