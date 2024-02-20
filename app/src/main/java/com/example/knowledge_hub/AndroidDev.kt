package com.example.knowledge_hub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class AndroidDev : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_dev)
        val javaSite = findViewById<CardView>(R.id.javaCard)
        val kotlin = findViewById<CardView>(R.id.kotlinCard)
        val firebase = findViewById<CardView>(R.id.firebaseCard)
        val xml = findViewById<CardView>(R.id.XMLCard)
        val json = findViewById<CardView>(R.id.jsonCard)
        val git = findViewById<CardView>(R.id.gitCard)
        val javaDevWebsite = findViewById<Button>(R.id.javaAndroidWebsitebtn)
        val kotlinDevWebsite = findViewById<Button>(R.id.kotlinAndroidWebsitebtn)


        javaSite.setOnClickListener {
            //Java
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://beginnersbook.com/java-tutorial-for-beginners-with-examples/"))
            startActivity(intent)

        }
        kotlin.setOnClickListener {
            //Kotlin
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://kotlinlang.org/docs/home.html"))
            startActivity(intent)
        }
        firebase.setOnClickListener {
            //firebase
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://firebase.google.com/docs/guides/"))
            startActivity(intent)
        }
        xml.setOnClickListener {
            //XML
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.geeksforgeeks.org/a-complete-guide-to-learn-xml-for-android-app-development/"))
            startActivity(intent)
        }
        json.setOnClickListener {
            //JSON
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.geeksforgeeks.org/json-parsing-in-android/"))
            startActivity(intent)
        }
        git.setOnClickListener {
            //GIT
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.w3schools.com/git/"))
            startActivity(intent)
        }
        javaDevWebsite.setOnClickListener {
            //JavaApp
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.geeksforgeeks.org/learn-java-for-android-app-development-a-complete-guide/"))
            startActivity(intent)
        }
        kotlinDevWebsite.setOnClickListener {
            //KotlinApp
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.geeksforgeeks.org/kotlin-android-tutorial/?ref=shm"))
            startActivity(intent)
        }
    }
}