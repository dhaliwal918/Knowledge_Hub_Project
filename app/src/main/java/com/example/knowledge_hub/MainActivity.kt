package com.example.knowledge_hub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLetsGo = findViewById<Button>(R.id.btnLetsGO)

        btnLetsGo.setOnClickListener {
            intent = Intent(applicationContext,contentActivity::class.java)
            startActivity(intent)
        }
    }
}