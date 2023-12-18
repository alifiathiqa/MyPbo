package com.example.mypbo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class activity_jobsheet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jobsheet)

        val btnNext = findViewById<ImageButton>(R.id.button2)
        val btnJob1 = findViewById<ImageButton>(R.id.btn_1)
        val btnJob2 = findViewById<ImageButton>(R.id.btn_2)
        val btnJob3 = findViewById<ImageButton>(R.id.btn_3)
        val btnJob4 = findViewById<ImageButton>(R.id.btn_4)
        val btnJob5 = findViewById<ImageButton>(R.id.btn_5)
        val btnJob6 = findViewById<ImageButton>(R.id.btn_6)
        val btnJob7 = findViewById<ImageButton>(R.id.btn_7)

        btnNext.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, activity_result ::class.java)
            startActivity(intent)
        })
        btnJob1.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, activity_jobsheet1 ::class.java)
            startActivity(intent)
        })
        btnJob2.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, activity_jobsheet2 ::class.java)
            startActivity(intent)
        })
        btnJob3.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, activity_jobsheet3 ::class.java)
            startActivity(intent)
        })
        btnJob4.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, activity_jobsheet4 ::class.java)
            startActivity(intent)
        })
        btnJob5.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, activity_jobsheet5 ::class.java)
            startActivity(intent)
        })

        btnJob6.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, activity_jobsheet6 ::class.java)
            startActivity(intent)
        })

        btnJob7.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, activity_jobsheet7 ::class.java)
            startActivity(intent)
        })
    }
}