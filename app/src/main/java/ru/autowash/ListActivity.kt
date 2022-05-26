package ru.autowash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.autowash.databinding.ActivityListBinding

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btn1.setOnClickListener {
                startActivity(Intent(this@ListActivity, MapActivity::class.java))
                finish()
            }
            btn2.setOnClickListener {
                startActivity(Intent(this@ListActivity, MoikaActivity::class.java))
                finish()
            }
            btn3.setOnClickListener {
                startActivity(Intent(this@ListActivity, PriceActivity::class.java))
                finish()
            }
            btn4.setOnClickListener {
                startActivity(Intent(this@ListActivity, ContactsActivity::class.java))
                finish()
            }
            btn5.setOnClickListener {
                startActivity(Intent(this@ListActivity, AboutActivity::class.java))
                finish()
            }
        }
    }
}