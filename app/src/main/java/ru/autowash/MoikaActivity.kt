package ru.autowash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.autowash.databinding.ActivityMoikaBinding

class MoikaActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMoikaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this@MoikaActivity, ListActivity::class.java))
        finish()
    }
}