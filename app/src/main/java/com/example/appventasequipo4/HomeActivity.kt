package com.example.appventasequipo4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageButton // Necesitarás importar ImageButton si no lo has hecho
import android.widget.Toast
import com.example.appventasequipo4.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mBinding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityHomeBinding.inflate(LayoutInflater.from(this))

        setContentView(mBinding.root)

        this.setTitle(R.string.app_cart)


        mBinding.btnContacto.setOnClickListener(this)
        mBinding.imageButton9.setOnClickListener(this)


        mBinding.p1.setOnClickListener { openDetailsActivity(R.drawable.llanta1, "Aeolus RSL TLR Road", 1999, "Bicicleta de Ruta", "29''", "2.4''", "Caucho", "350 gramos", "Una llanta de competencia en carretera con un diseño de algodón que prioriza la velocidad y el agarre en todas las condiciones.") } // Debes tener un ID único para cada producto
        mBinding.p2.setOnClickListener { openDetailsActivity(R.drawable.llanta2, "Vallnord RSL XR TLR", 1499, "Bicicleta de Montaña", "29''", "2.4''" , "Caucho", "700 gramos", "Una llanta de cross country ligera que es perfecta para la velocidad y el agarre en tierra superempedrada y rápida.")}
        mBinding.p3.setOnClickListener { openDetailsActivity(R.drawable.llanta3, "Galbraith RSL SE TLR", 1499, "Bicicleta de Montaña", "29''", "2.4''", "Caucho", "700 gramos", "Una llanta agresiva para pistas que ofrece una increíble protección antiponchaduras y agarre en condiciones de pistas flojas y blandas.") }
        mBinding.p4.setOnClickListener { openDetailsActivity(R.drawable.llanta4, "Brevard RSL SE TLR", 1499, "Bicicleta de Montaña", "29''", "2.4''", "Caucho", "700 gramos", "Una llanta para pistas versátil que ofrece una increíble protección contra ponchaduras y agarre en condiciones de pistas mixtas y terrenos flojos.") }
        mBinding.p5.setOnClickListener { openDetailsActivity(R.drawable.llanta5, "Montrose RSL XT TLR", 1499, "Bicicleta de Montaña", "29''", "2.4''", "Caucho", "700 gramos","Una llanta de pistas de rodado rápido con la combinación de agarre, velocidad y resistencia para un rendimiento versátil en tierra generalmente empedrada") }
        mBinding.p6.setOnClickListener { openDetailsActivity(R.drawable.llanta6, "Sainte-Anne RSL XR TLR",1499, "Bicicleta de Montaña", "29''", "2.4''", "Caucho", "700 gramos", "Una llanta cross country versátil que proporciona velocidad y agarre en condiciones de carrera mixtas con raíces y rocosas e, incluso, húmedas.") }
        mBinding.p7.setOnClickListener { openDetailsActivity(R.drawable.llanta7, "Gunnison RSL XT TLR", 1499, "Bicicleta de Montaña", "29''", "2.4''", "Caucho", "700 gramos", "Una llanta de pista versátil que incluye protección increíble de la banda de rodamiento, la pared lateral y las ponchaduras por cortes por pinchaduras en un paquete ligero.") }
        mBinding.p8.setOnClickListener { openDetailsActivity(R.drawable.llanta8, "Betasso RSL GX TLR", 1299, "Bicleta para Grava", "29''", "2.4''", "Caucho", "700 gramos", "Una llanta agresiva para grava perfecta para proporcionar agarre y resistencia en condiciones mixtas y sueltas.") }
        mBinding.p9.setOnClickListener { openDetailsActivity(R.drawable.llanta9, "Brevard RSL XT TLR", 1299, "Bicicleta de Montaña", "29''", "2.4''", "Caucho", "700 gramos", "Una llanta para pistas versátil que ofrece una increíble protección contra ponchaduras y agarre en condiciones de pistas mixtas y terrenos flojos.") }
        mBinding.p10.setOnClickListener { openDetailsActivity(R.drawable.llanta10, "Brevard Pro XR TLR", 1199, "Bicicleta de Montaña", "29''", "2.4''", "Caucho", "700 gramos" ,"Una versátil llanta para pista que proporciona agarre equilibrado y protección contra ponchaduras en condiciones mixtas y sueltas.") }

    }

    private fun openDetailsActivity(
        productImageResId: Int,
        productName: String,
        productPrice: Int,
        productType: String,
        productDiameter: String,
        productWidth: String,
        productMaterial: String,
        productWeight: String,
        productDescription: String
    ) {
        val intent = Intent(this, activity_details::class.java).apply {
            putExtra("EXTRA_IMAGE", productImageResId)
            putExtra("EXTRA_NAME", productName)
            putExtra("EXTRA_PRICE", "$productPrice") // Se espera un String en Details
            putExtra("EXTRA_TYPE", productType)
            putExtra("EXTRA_DIAMETER", productDiameter)
            putExtra("EXTRA_WIDTH", productWidth)
            putExtra("EXTRA_MATERIAL", productMaterial)
            putExtra("EXTRA_WEIGHT", productWeight)
            putExtra("EXTRA_DESCRIPTION", productDescription)
        }
        startActivity(intent)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btnContacto -> {
                startActivity(Intent(this, PantallaRedesS::class.java))
            }
            R.id.imageButton9 -> { // Asumo que es tu botón de carrito
                startActivity(Intent(this, CartActivity::class.java))
            }
        }
    }
}