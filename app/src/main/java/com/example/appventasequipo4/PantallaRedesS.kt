package com.example.appventasequipo4

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PantallaRedesS : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_redes_s)

        val btnfb: Button = findViewById(R.id.btnFb)
        btnfb.setOnClickListener {
            val url = "https://es-la.facebook.com/login/" //Ola
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        val btnig: Button = findViewById(R.id.btnIg)
        btnig.setOnClickListener {
            val url = "https://www.instagram.com/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        val btnwh: Button = findViewById(R.id.btnWha)
        btnwh.setOnClickListener {
            val url = "https://www.whatsapp.com/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }
}