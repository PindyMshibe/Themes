package com.example.batsumisa

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

const val EXTRA_MESSAGE = "com.example.BatsumiSA.MESSAGE"
class SplashActivityScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var sharedPreferences: SharedPreferences
        val themeKey = "currentTheme"
        super.onCreate(savedInstanceState)
        sharedPreferences = getSharedPreferences("ThemePref", Context.MODE_PRIVATE)

        theme.applyStyle(R.style.AppTheme, true)
        setContentView(R.layout.activity_splash_screen)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, YourDashboard::class.java)
            startActivity(intent)
        }
    }
}