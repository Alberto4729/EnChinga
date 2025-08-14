package com.albertoapps.androidcourse.presentation.congrats

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.albertoapps.androidcourse.R
import com.albertoapps.androidcourse.databinding.ActivityCongratsBinding

class CongratsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCongratsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCongratsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}