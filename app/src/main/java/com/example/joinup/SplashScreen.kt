package com.example.joinup

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        //to hide the action bar

//        //to hide the action bar
//        supportActionBar!!.hide()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            window.statusBarColor = resources.getColor(R.color.white, this.theme)
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = resources.getColor(R.color.white)
        }



        //the time within which the screen will disappear


        //the time within which the screen will disappear
        val thread: Thread = object : Thread() {
            override fun run() {
                try {
                    sleep(4000)
                } catch (e: Exception) {
                    e.printStackTrace()
                } finally {
                    val intent = Intent(this@SplashScreen, SignIn::class.java)
                    startActivity(intent)
                }
            }
        }
        thread.start()
    }
}