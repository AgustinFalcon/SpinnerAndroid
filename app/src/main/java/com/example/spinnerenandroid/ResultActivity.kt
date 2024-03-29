package com.example.spinnerenandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.spinnerenandroid.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val user = intent.getSerializableExtra("user") as User
        binding.tvResult.text = user.name
    }
}