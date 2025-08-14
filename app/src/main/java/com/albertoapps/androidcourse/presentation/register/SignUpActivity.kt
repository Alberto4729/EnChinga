package com.albertoapps.androidcourse.presentation.register

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.albertoapps.androidcourse.R
import com.albertoapps.androidcourse.databinding.ActivitySignUpBinding
import com.albertoapps.androidcourse.presentation.congrats.CongratsActivity
import com.albertoapps.androidcourse.presentation.login.LoginActivity

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListeners()
    }

    private fun setListeners() {
        with(binding) {
            signInBtn.setOnClickListener {
                startActivity(Intent(this@SignUpActivity, LoginActivity::class.java))
            }
            btnSignUp.setOnClickListener{
                startActivity(Intent(this@SignUpActivity, CongratsActivity::class.java))
            }
        }
    }
}