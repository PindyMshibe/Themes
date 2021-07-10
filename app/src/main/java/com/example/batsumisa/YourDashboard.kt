package com.example.batsumisa

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.provider.Settings
import android.widget.Button
import android.widget.Toast
import android.view.View
import android.view.ViewGroup
import android.widget.Switch
import androidx.appcompat.app.AppCompatDelegate


class YourDashboard : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_your_dashboard)

        val button: Button = findViewById(R.id.button2)
        button.setOnClickListener() {
            val intent = Intent(this, SplashActivityScreen::class.java)
            startActivity(intent)
        }

         val button3: Button = findViewById(R.id.button3)
         button3.setOnClickListener {
             val intent = Intent(this, MainActivity::class.java)
             startActivity(intent)
         }
        val button4: Button = findViewById(R.id.button4)
        button4.setOnClickListener{
            val intent = Intent(this, Register::class.java)
            startActivity(intent)

        }
        val switch: Switch = findViewById(R.id.switch1)

        switch.setOnClickListener{
            val isNightTheme = resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK
            when(isNightTheme){
                Configuration.UI_MODE_NIGHT_YES ->
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                Configuration.UI_MODE_NIGHT_NO ->
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }

        }

    }
}