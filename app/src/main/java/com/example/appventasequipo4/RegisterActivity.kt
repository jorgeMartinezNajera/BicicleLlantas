package com.example.appventasequipo4

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.appventasequipo4.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity(), View.OnClickListener, View.OnFocusChangeListener {

    private lateinit var mBinding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityRegisterBinding.inflate(LayoutInflater.from(this))
        mBinding.txtCorreoEt.onFocusChangeListener = this
        mBinding.txtPassEt.onFocusChangeListener = this
        mBinding.txtCPassEt.onFocusChangeListener = this
        mBinding.btnRegistrar.setOnClickListener(this)

        setContentView(mBinding.root)
        this.setTitle(R.string.app_register);
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

    private fun validarCContrasena(): Boolean {
        var errorMessage: String? = null
        val value = mBinding.txtCPassEt.text.toString()
        if (value.isEmpty()) {
            errorMessage = "Debe ingresar una contraseña"
        } else if (value.length < 8) {
            errorMessage = "La contraseña debe tener al menos 8 caracteres"
        }

        if (errorMessage != null) {
            mBinding.txtCPassTil.apply {
                isErrorEnabled = true
                error = errorMessage
            }
        }

        return errorMessage == null
    }

    private fun validarContrasenas(): Boolean {
        var errorMessage: String? = null
        val contra = mBinding.txtPassEt.text.toString()
        val ccontra = mBinding.txtCPassEt.text.toString()
        if (contra != ccontra) {
            errorMessage = "Las contraseñas no coinciden, revisa"
        }

        if (errorMessage != null) {
            mBinding.txtCPassTil.apply {
                isErrorEnabled = true
                error = errorMessage
            }
        }

        return errorMessage == null
    }

    override fun onClick(view: View?) {
        if (validarCorreo() && validarCContrasena() && validarContrasenas()) {
            if (view != null && view.id == R.id.btnRegistrar) {
                Toast.makeText(this, "Registro realizado con exito", Toast.LENGTH_SHORT).show()

                val extras = Bundle()

                extras.putString(
                    "correo",
                    mBinding.txtCorreoEt.text.toString()
                ) // se obtiene el valor mediante getString(...)

                extras.putString(
                    "contra",
                    mBinding.txtCPassEt.text.toString()
                ) // se obtiene el valor mediante getString(...)


                val intent = Intent(this, LoginActivity::class.java)
                //Agrega el objeto bundle a el Intnent
                intent.putExtras(extras)
                //Inicia Activity
                startActivity(intent)

            }
        } else {
            validarCorreo()
            validarContrasena()
            validarContrasenas()
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

                R.id.txtCPassEt -> {
                    if (hasFocus) {
                        if (mBinding.txtCPassTil.isErrorEnabled) {
                            mBinding.txtCPassTil.isErrorEnabled = false
                        }
                    } else {
                        validarCContrasena()
                    }
                }
            }
        }
    }


}