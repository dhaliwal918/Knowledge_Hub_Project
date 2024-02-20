package com.example.knowledge_hub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class EthicalHacking : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ethical_hacking)

        val CN = findViewById<CardView>(R.id.CNCard)
        val OP = findViewById<CardView>(R.id.OPCard)
        val webSecurity = findViewById<CardView>(R.id.websecurityCard)
        val proglang = findViewById<CardView>(R.id.proglangEHCard)
        val certificate = findViewById<CardView>(R.id.certificateCard)
        val database = findViewById<CardView>(R.id.databaseEHCard)
        val tools = findViewById<CardView>(R.id.toolsCard)
        val networkAndSecurity = findViewById<CardView>(R.id.networkingAndSeurityCard)
        val resourceEH = findViewById<Button>(R.id.bestResourceEH)

        CN.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.geeksforgeeks.org/basics-computer-networking/"))
            startActivity(intent)
        }
        OP.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.geeksforgeeks.org/what-is-an-operating-system/"))
            startActivity(intent)
        }
        webSecurity.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.geeksforgeeks.org/web-security-considerations/"))
            startActivity(intent)
        }
        proglang.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.geeksforgeeks.org/top-5-programming-languages-for-ethical-hackers/"))
            startActivity(intent)
        }
        certificate.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.coursera.org/articles/ethical-hacking-certifications"))
            startActivity(intent)
        }
        database.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.classcentral.com/course/udemy-google-hacking-databases-information-gather-69305"))
            startActivity(intent)
        }
        tools.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.tutorialspoint.com/ethical_hacking/ethical_hacking_tools.htm"))
            startActivity(intent)
        }
        networkAndSecurity.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.javatpoint.com/ethical-hacking-basic-network"))
            startActivity(intent)
        }
        resourceEH.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.youtube.com/@WsCubeCyberSecurity"))
        }


    }
}