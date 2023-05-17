package com.htd.compressfile.zipmasterpro.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.htd.compressfile.zipmasterpro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}