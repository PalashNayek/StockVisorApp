package com.palash.stockvisorapp.Activities

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.palash.stockvisorapp.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
        setContentView(R.layout.activity_splash)
        val imageView: ImageView = findViewById(R.id.loadingImg)
        Glide.with(this).load(R.drawable.loading).into(imageView)
        Handler().postDelayed({
            /*if (loggedIn=="1"){
                val intent = Intent(this, DashboardActivity::class.java)
                startActivity(intent)
                finish()
            }else{
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
                finish()
            }*/

            startActivity(Intent(this, MainContainerActivity::class.java))
            finish()
        }, SPLASH_TIME_OUT)
    }
    companion object{
        const val SPLASH_TIME_OUT:Long = 3000 // 3 sec

        /*val intent = Intent(this, MainContainerActivity::class.java)
        startActivity(intent)*/
    }
}