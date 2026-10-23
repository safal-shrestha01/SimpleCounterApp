package com.example.simplecounter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textCount = findViewById<TextView>(R.id.textCount)
        val btnClick = findViewById<Button>(R.id.btnClick)

        btnClick.setOnClickListener {
            count++
            textCount.text = "Count: $count"
        }
    }
}
