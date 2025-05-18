package com.example.appventasequipo4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.appventasequipo4.databinding.ActivityLoginBinding
import com.example.appventasequipo4.databinding.ActivityRegisterBinding
import com.google.android.material.snackbar.Snackbar
import java.util.regex.Pattern

class LoginActivity : AppCompatActivity(), View.OnClickListener, View.OnFocusChangeListener{

    private lateinit var mBinding: ActivityLoginBinding
    private var correo: String? = null
    private var contra: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityLoginBinding.inflate(LayoutInflater.from(this))
        mBinding.txtCorreoEt.onFocusChangeListener = this
        mBinding.txtPassEt.onFocusChangeListener = this
        mBinding.btnRegister.setOnClickListener(this)
        mBinding.btnLogin.setOnClickListener(this)

        correo = intent.getStringExtra("correo")
        contra = intent.getStringExtra("contra")

        setContentView(mBinding.root)

        this.setTitle(R.string.app_login);
    }

    private fun validarCorreo(): Boolean {
        var errorMessage: String? = null
        val value = mBinding.txtCorreoEt.text.toString()
        if (value.isEmpty()) {
            errorMessage = "Debe ingresar un correo"
        } else if (!Patterns.EMAIL_ADDRESS.matcher(value).matches()) {
            errorMessage = "El correo ingresado no es válido"
        }

        if (errorMessage != null) {
            mBinding.txtCorreoTil.apply {
                isErrorEnabled = true
                error = errorMessage
            }
        }
        return errorMessage == null
    }

    private fun validarContrasena(): Boolean {
        var errorMessage: String? = null
        val value = mBinding.txtPassEt.text.toString()
        if (value.isEmpty()) {
            errorMessage = "Debe ingresar una contraseña"
        } else if (value.length < 8) {
            errorMessage = "La contraseña debe tener al menos 8 caracteres"
        }

        if (errorMessage != null) {
            mBinding.txtPassTil.apply {
                isErrorEnabled = true
                error = errorMessage
            }
        }

        return errorMessage == null
    }

    override fun onClick(view: View?) {
        var paraRegistro = RegisterActivity()
        if(view != null && view.id==R.id.btnRegister){
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        if(view != null && view.id==R.id.btnLogin){
            if (validarCorreo() && validarContrasena()){
                if (correo == mBinding.txtCorreoEt.text.toString() && contra == mBinding.txtPassEt.text.toString()){
                    startActivity(Intent(this, HomeActivity::class.java))
                }else{
                    Toast.makeText(this,"Compruebe los datos ingresados", Toast.LENGTH_SHORT).show()
                }
            }else{
                validarCorreo()
                validarContrasena()
            }
        }
    }

    override fun onFocusChange(view: View?, hasFocus: Boolean) {
        if (view != null) {
            when (view.id) {
                R.id.txtCorreoEt -> {
                    if (hasFocus) {
                        if (mBinding.txtCorreoTil.isErrorEnabled) {
                            mBinding.txtCorreoTil.isErrorEnabled = false
                        }
                    } else {
                        validarCorreo()
                    }
                }

                R.id.txtPassEt -> {
                    if (hasFocus) {
                        if (mBinding.txtPassTil.isErrorEnabled) {
                            mBinding.txtPassTil.isErrorEnabled = false
                        }
                    } else {
                        validarContrasena()
                    }
                }
            }
        }
    }

}