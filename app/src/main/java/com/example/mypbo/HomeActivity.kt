package com.example.mypbo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btn1 = findViewById<ImageButton>(R.id.button1)

        btn1.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, activity_jobsheet ::class.java)
            startActivity(intent)
        })



    }
}