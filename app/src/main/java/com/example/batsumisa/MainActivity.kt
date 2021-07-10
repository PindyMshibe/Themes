package com.example.batsumisa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button6: Button = findViewById(R.id.button6)
        button6.setOnClickListener() {
            val intent = Intent(this, MainActivity::class.java)
            finishAffinity()

        }
    }
}