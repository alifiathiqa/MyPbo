package com.example.mypbo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class activity_result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val btnTA = findViewById<ImageButton>(R.id.btn_TA)
        btnTA.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, activity_tugasakhir ::class.java)
            startActivity(intent)
        })
    }
}