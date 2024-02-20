package com.example.knowledge_hub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class WebDev : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_dev)
        val html =  findViewById<CardView>(R.id.htmlCard)
        val css  =  findViewById<CardView>(R.id.cssCard)
        val javascript  =  findViewById<CardView>(R.id.jsCard)
        val reactjs  =  findViewById<CardView>(R.id.reactjsCard)
        val expressjs  =  findViewById<CardView>(R.id.expressjsCard)
        val nodejs  =  findViewById<CardView>(R.id.nodejsCard)
        val mongodb  =  findViewById<CardView>(R.id.mongodbCard)
        val git  =  findViewById<CardView>(R.id.gitCard)
        val bestResourceWeb  =  findViewById<Button>(R.id.bestResourceWebDev)

        html.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.w3schools.com/html/"))
            startActivity(intent)
        }
        css.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.w3schools.com/css/"))
            startActivity(intent)
        }
        javascript.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.w3schools.com/js/"))
            startActivity(intent)
        }
        reactjs.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://react.dev/blog/2023/03/16/introducing-react-dev"))
            startActivity(intent)
        }
        expressjs.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("http://expressjs.com/"))
            startActivity(intent)
        }
        nodejs.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://nodejs.org/en"))
            startActivity(intent)
        }
        mongodb.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.mongodb.com/"))
            startActivity(intent)
        }
        git.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.atlassian.com/git"))
            startActivity(intent)
        }
        bestResourceWeb.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://youtube.com/playlist?list=PLu0W_9lII9agq5TrH9XLIKQvv0iaF2X3w&si=GTY5DmCBJcvXGzJm"))
            startActivity(intent)
        }



    }
}