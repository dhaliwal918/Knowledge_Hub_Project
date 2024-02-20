package com.example.knowledge_hub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class Devios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ios_dev)


        val macbook = findViewById<CardView>(R.id.macCard)
        val xcode = findViewById<CardView>(R.id.xcodeCard)
        val swift = findViewById<CardView>(R.id.swiftCard)
        val network = findViewById<CardView>(R.id.networkCard)
        val thirdpartylib = findViewById<CardView>(R.id.thirdpartylibCard)
        val ui = findViewById<CardView>(R.id.UICard)
        val designPattern = findViewById<CardView>(R.id.designpatternCard)
        val resourceiosDev = findViewById<Button>(R.id.bestResourceiosDev)

        macbook.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.apple.com/macbook-pro/"))
            startActivity(intent)
        }
        xcode.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://developer.apple.com/xcode/"))
            startActivity(intent)
        }
        swift.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://developer.apple.com/swift/"))
            startActivity(intent)
        }
        network.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://developer.apple.com/documentation/network"))
            startActivity(intent)
        }
        thirdpartylib.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://codersera.com/blog/open-source-swift-libraries/"))
            startActivity(intent)
        }
        ui.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://developer.apple.com/tutorials/swiftui-concepts"))
            startActivity(intent)
        }
        designPattern.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://refactoring.guru/design-patterns/swift"))
            startActivity(intent)
        }
        resourceiosDev.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.javatpoint.com/ios-development-using-swift"))
            startActivity(intent)
        }


    }
}
