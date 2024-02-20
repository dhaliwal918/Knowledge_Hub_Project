package com.example.knowledge_hub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class contentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content)

        val androidDev = findViewById<CardView>(R.id.androidDevCard)
        val webDev = findViewById<CardView>(R.id.webDevCard)
        val iosDev = findViewById<CardView>(R.id.iosDevCard)
        val machineLearning = findViewById<CardView>(R.id.MLCard)
        val ethicalHacking = findViewById<CardView>(R.id.ethicalHackingCard)
        val blockchainDev = findViewById<CardView>(R.id.blockchainDevCard)
        val btnCallUS = findViewById<Button>(R.id.callusbtn)

        androidDev.setOnClickListener {
            //Android
            intent = Intent(applicationContext , AndroidDev::class.java)
            startActivity(intent)
        }
        webDev.setOnClickListener {
            //Web
            intent = Intent(applicationContext , WebDev::class.java)
            startActivity(intent)
        }
        iosDev.setOnClickListener {
            //ios
            intent = Intent(applicationContext , Devios::class.java)
            startActivity(intent)

        }
        machineLearning.setOnClickListener {
            //ML
            intent = Intent(applicationContext , MLActivity::class.java)
            startActivity(intent)

        }
        blockchainDev.setOnClickListener {
            //Blockchain
            intent = Intent(applicationContext , Blockchain::class.java)
            startActivity(intent)

        }
        ethicalHacking.setOnClickListener {
            //Ethical Hacking
            intent = Intent(applicationContext,EthicalHacking::class.java)
            startActivity(intent)
        }
        btnCallUS.setOnClickListener {
            //Call us
            intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:+919464208003")
            startActivity(intent)
        }

    }
}