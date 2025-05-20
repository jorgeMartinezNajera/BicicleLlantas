package com.example.appventasequipo4

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class activity_details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_details)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val productName = findViewById<TextView>(R.id.articleName)
        val productPrice = findViewById<TextView>(R.id.price)
        val productDescription = findViewById<TextView>(R.id.descripcion)
        val productImage = findViewById<ImageView>(R.id.imgContainer)
        val productType = findViewById<TextView>(R.id.tipo)
        val productDiameter = findViewById<TextView>(R.id.diametro)
        val productWidth = findViewById<TextView>(R.id.ancho)
        val productMaterial = findViewById<TextView>(R.id.material)
        val productWeight = findViewById<TextView>(R.id.peso)

        val name: String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        val price: String = intent.extras?.getString("EXTRA_PRICE").orEmpty()
        val description: String = intent.extras?.getString("EXTRA_DESCRIPTION").orEmpty()
        val image: Int = intent.extras?.getInt("EXTRA_IMAGE") ?: 0
        val type: String = intent.extras?.getString("EXTRA_TYPE").orEmpty()
        val diameter: String = intent.extras?.getString("EXTRA_DIAMETER").orEmpty()
        val width: String = intent.extras?.getString("EXTRA_WIDTH").orEmpty()
        val material: String = intent.extras?.getString("EXTRA_MATERIAL").orEmpty()
        val weight: String = intent.extras?.getString("EXTRA_WEIGHT").orEmpty()

        productName.text = name
        productPrice.text = "$$price MXN"
        productDescription.text = description
        productImage.setImageResource(image)
        productType.text = type
        productDiameter.text = diameter
        productWidth.text = width
        productMaterial.text = material
        productWeight.text = "$weight gramos"

        findViewById<ImageButton>(R.id.btnBack).setOnClickListener {
            finish()
        }
    }


}