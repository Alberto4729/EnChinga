package com.albertoapps.androidcourse.presentation.register

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.albertoapps.androidcourse.R
import com.albertoapps.androidcourse.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        configureView()
    }

    private fun configureView() {
        with(binding) {
            titleSingUp.text = getString(R.string.sign_up)
            instructions.text = getString(R.string.instruccions)
            buttonSignUpRegister.setText(getString(R.string.sign_up))
        }

    }
}