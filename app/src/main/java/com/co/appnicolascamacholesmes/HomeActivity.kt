package com.co.appnicolascamacholesmes

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
//autor: Nicolas Camacho Lesmes
class HomeActivity : AppCompatActivity() {

    lateinit var backBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        backBtn = findViewById(R.id.back_btn)
        backBtn.setOnClickListener{
            val i = Intent(this@HomeActivity, MainActivity::class.java)
            startActivity(i)
        }
    }
}