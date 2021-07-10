package com.palash.stockvisorapp.Activities

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.palash.stockvisorapp.R


class SplashActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val imageView: ImageView = findViewById(R.id.loadingImg)
        Glide.with(this).load(R.drawable.loading).into(imageView)

    }
}