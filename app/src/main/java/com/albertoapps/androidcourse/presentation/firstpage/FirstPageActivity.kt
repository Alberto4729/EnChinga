package com.albertoapps.androidcourse.presentation.firstpage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.albertoapps.androidcourse.databinding.ActivityFirstPageBinding

// este es el controlador
class FirstPageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFirstPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFirstPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}