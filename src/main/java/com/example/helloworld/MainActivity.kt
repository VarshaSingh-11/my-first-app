package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val mybutton = findViewById<Button>(R.id.button)
        mybutton.setOnClickListener{
            Toast.makeText(this,"hey cutie!!",Toast.LENGTH_LONG).show()
        }
    }
}