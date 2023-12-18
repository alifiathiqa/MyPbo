package com.example.mypbo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginButton= findViewById(R.id.btn_login)

        loginButton.setOnClickListener {
            val x = Intent(this@LoginActivity,HomeActivity::class.java)
            startActivity(x)
        }

        // Handle "Daftar" click
        val txt_btn1 = findViewById(R.id.txt_register) as TextView

        txt_btn1.setOnClickListener {
            // Pindah ke halaman registrasi
            startActivity(Intent(this, RegisterActivity::class.java))
            // Selesaikan aktivitas saat ini agar tidak bisa kembali lagi
            finish();
        }
    }
}