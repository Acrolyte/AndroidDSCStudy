package com.example.androiddscstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)
        val button7: Button = findViewById(R.id.button7)
        val button8: Button = findViewById(R.id.button8)
        val button9: Button = findViewById(R.id.button9)
        val button10: Button = findViewById(R.id.button10)

        button1.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("pic", "Abhinav")
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("pic", "Ayushi")
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("pic", "Divya")
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("pic", "Prachi")
            startActivity(intent)
        }
        button5.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("pic", "Prashant")
            startActivity(intent)
        }
        button6.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("pic", "Saumya")
            startActivity(intent)
        }
        button7.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("pic", "Saurabh")
            startActivity(intent)
        }
        button8.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("pic", "AyushiM")
            startActivity(intent)
        }
        button9.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("pic", "Vanshika")
            startActivity(intent)
        }
        button10.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("pic", "Vineet")
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater : MenuInflater = menuInflater
        inflater.inflate(R.menu.ex_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.it2 ->{
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("pic", "DEV")
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}