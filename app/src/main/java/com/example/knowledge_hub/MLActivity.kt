package com.example.knowledge_hub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MLActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mlactivity)

        val statistics  =  findViewById<CardView>(R.id.statisticsCard)
        val algorithm  =  findViewById<CardView>(R.id.algorithmCard)
        val bigData  =  findViewById<CardView>(R.id.bigDataCard)
        val progLang  =  findViewById<CardView>(R.id.proglangCard)
        val library = findViewById<CardView>(R.id.librariesCard)
        val devOps = findViewById<CardView>(R.id.devopscard)
        val cloudPlatform  =  findViewById<CardView>(R.id.cloutplatformCard)
        val git  =  findViewById<CardView>(R.id.gitCard)
        val resourceML = findViewById<Button>(R.id.bestResourceML)

        statistics.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.w3schools.com/ai/ai_statistics.asp"))
            startActivity(intent)
        }
        algorithm.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.google.com/amp/s/www.geeksforgeeks.org/machine-learning-algorithms/amp"))
            startActivity(intent)
        }
        bigData.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.javatpoint.com/what-is-big-data-and-machine-learning"))
            startActivity(intent)
        }
        progLang.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.springboard.com/blog/data-science/best-language-for-machine-learning/"))
            startActivity(intent)
        }
        library.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.google.com/amp/s/www.geeksforgeeks.org/best-python-libraries-for-machine-learning/amp/"))
            startActivity(intent)
        }
        devOps.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://forum.freecodecamp.org/t/devops-engineer-to-machine-learning/478609"))
            startActivity(intent)
        }
        cloudPlatform.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.geeksforgeeks.org/top-cloud-computing-platforms-for-machine-learning/"))
            startActivity(intent)
        }
        git.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.atlassian.com/git"))
            startActivity(intent)
        }
        resourceML.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.geeksforgeeks.org/machine-learning/"))
            startActivity(intent)
        }


    }
}