package com.example.appventasequipo4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ContactoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
        //Botón Redes
        val btn: Button = this.findViewById(R.id.btnRedes)
        btn.setOnClickListener {
            val intent = Intent(this, PantallaRedesS::class.java)
            startActivity(intent)
        }
        //Botón Vendedores
        val btn1: Button = this.findViewById(R.id.btnDirec)
        btn1.setOnClickListener {
            val intent1 = Intent(this, PantallaVendedor::class.java)
            startActivity(intent1)
        }
        //Botón Salida
        val btn2: Button = this.findViewById(R.id.btnSalida)
        btn2.setOnClickListener {
            finishAffinity()
        }
    }
}