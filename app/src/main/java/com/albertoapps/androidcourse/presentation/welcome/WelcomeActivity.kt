package com.albertoapps.androidcourse.presentation.welcome

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.albertoapps.androidcourse.databinding.ActivityWelcomeBinding
import com.albertoapps.androidcourse.presentation.login.LoginActivity
import com.albertoapps.androidcourse.presentation.register.SignUpActivity

class WelcomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListeners()
    }

    private fun setListeners() {
        with(binding){
            btnSignIn.setOnClickListener {
                val goToLoginScreen = Intent(this@WelcomeActivity, LoginActivity::class.java)
                startActivity(goToLoginScreen)
            }
            btnSignUp.setOnClickListener {
                startActivity(Intent(this@WelcomeActivity, SignUpActivity::class.java))
            }
        }
    }
}





