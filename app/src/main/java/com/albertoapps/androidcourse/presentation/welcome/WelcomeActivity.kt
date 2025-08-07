package com.albertoapps.androidcourse.presentation.welcome

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.albertoapps.androidcourse.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }


}





