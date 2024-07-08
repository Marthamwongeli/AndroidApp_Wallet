package com.akirachix.enwallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.enwallet.databinding.ActivityMainBinding
import com.akirachix.enwallet.databinding.EnwalletCardsBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:EnwalletCardsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = EnwalletCardsBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}