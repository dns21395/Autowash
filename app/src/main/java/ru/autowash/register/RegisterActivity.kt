package ru.autowash.register

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.autowash.ListActivity
import ru.autowash.databinding.ActivityRegister2Binding

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityRegister2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            knopka.setOnClickListener {
                startActivity(Intent(this@RegisterActivity, ListActivity::class.java))
                finish()
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this@RegisterActivity, MainActivity::class.java))
        finish()
    }
}