package com.albertoapps.androidcourse.presentation.login

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.albertoapps.androidcourse.R
import com.albertoapps.androidcourse.databinding.ActivityLoginBinding
import com.albertoapps.androidcourse.presentation.register.SignUpActivity
import com.albertoapps.androidcourse.presentation.utils.printValuesInConsole

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListeners()
    }

    private fun setListeners(){
        with(binding){
            signUpBtn.setOnClickListener {
                startActivity(Intent(this@LoginActivity, SignUpActivity::class.java))
            }
            btnLogin.setOnClickListener {
                val userName: String = user.text.toString()
                val password: String = password.text.toString()

                userName.printValuesInConsole("nombre de usuario")
                password.printValuesInConsole("contraseña del usuario")
            }
        }
    }

}