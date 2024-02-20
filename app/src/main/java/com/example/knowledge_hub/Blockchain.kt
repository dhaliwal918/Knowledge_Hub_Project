package com.example.knowledge_hub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class Blockchain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blockchain)

        val webdev = findViewById<CardView>(R.id.webDevCard)
        val dsa = findViewById<CardView>(R.id.dsaCard)
        val cryptography  = findViewById<CardView>(R.id.cryptographyCard)
        val smartContracts  = findViewById<CardView>(R.id.smartcontractsCard)
        val proglang  = findViewById<CardView>(R.id.proglangBCard)
        val api = findViewById<CardView>(R.id.apiCard)
        val resourceBlockchain = findViewById<Button>(R.id.bestResourceBlockchain)

        webdev.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.geeksforgeeks.org/web-development/"))
            startActivity(intent)
        }
        dsa.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.freecodecamp.org/news/learn-data-structures-and-algorithms/"))
            startActivity(intent)
        }
        cryptography.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.geeksforgeeks.org/cryptography-in-blockchain/"))
            startActivity(intent)
        }
        smartContracts.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.investopedia.com/terms/s/smart-contracts.asp"))
            startActivity(intent)
        }
        proglang.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.codecademy.com/resources/blog/programming-languages-blockchain-development/"))
            startActivity(intent)
        }
        api.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.blockchain.com/api"))
            startActivity(intent)
        }
        resourceBlockchain.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.javatpoint.com/blockchain-tutorial"))
            startActivity(intent)
        }

    }
}