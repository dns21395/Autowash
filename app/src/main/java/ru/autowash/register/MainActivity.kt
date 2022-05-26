package ru.autowash.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.autowash.databinding.ActivityRegister1Binding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityRegister1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnSignIn.setOnClickListener {
                startActivity(Intent(this@MainActivity, RegisterActivity::class.java))
                finish()
            }
            btnRegister.setOnClickListener {
                startActivity(Intent(this@MainActivity, RegisterActivity::class.java))
                finish()
            }
        }
    }
}