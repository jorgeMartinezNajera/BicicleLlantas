package com.example.appventasequipo4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import com.example.appventasequipo4.databinding.ActivityHomeBinding
import com.example.appventasequipo4.databinding.ActivityRegisterBinding

class HomeActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mBinding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityHomeBinding.inflate(LayoutInflater.from(this))

        mBinding.btnContacto.setOnClickListener(this)
        mBinding.imageButton9.setOnClickListener(this)

        setContentView(mBinding.root)
        this.setTitle(R.string.app_cart)
    }

    fun clicBoton(view: View){
        when(view.id){
            R.id.p1-> Toast.makeText(this, "Cuenta con varios compartimentos para los pinceles y soporte", Toast.LENGTH_LONG).show()
            R.id.imageButton5-> Toast.makeText(this,"Set de 10 pinceles de fibra Taklon más estuche", Toast.LENGTH_LONG).show()
            R.id.imageButton6-> Toast.makeText(this, "Estuche con soporte con juego de pinceles más pala y esponja ", Toast.LENGTH_LONG).show()
            R.id.imageButton3-> Toast.makeText(this, "Estuche c/10 pinceles y cierre para guardarlos", Toast.LENGTH_LONG).show()
            R.id.imageButton4-> Toast.makeText(this, "Estuche más pinceles de cerdas", Toast.LENGTH_LONG).show()
            R.id.imageButton2-> Toast.makeText(this,"Estuche tipo caja, de madera con 38 pinceles", Toast.LENGTH_LONG).show()
            R.id.imageButton12-> Toast.makeText(this, "Estuche tipo lapicera más 12 pinceles diferentes tipos de cerdas", Toast.LENGTH_LONG).show()
            R.id.imageButton13-> Toast.makeText(this, "Estuche azul con pinceles, esponja y palita", Toast.LENGTH_LONG).show()
        }

    }

    override fun onClick(view: View?) {
        if(view != null && view.id == R.id.btnContacto){
            startActivity(Intent(this, ContactoActivity::class.java))
        }
        if(view != null && view.id == R.id.imageButton9){
            startActivity(Intent(this, CartActivity::class.java))
        }
    }
}