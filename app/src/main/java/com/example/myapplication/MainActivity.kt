package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val desktopImage = findViewById(R.id.imageView) as ImageView

        val imgResId = R.drawable.pet
        desktopImage.setImageResource(imgResId)

        val btn_click_me = findViewById(R.id.signuphere) as Button
        btn_click_me.setBackgroundColor(resources.getColor(R.color.silver))

        btn_click_me.setOnClickListener {
            startActivity(Intent(this,ImageProcessingActivity::class.java))
        }
    }
}