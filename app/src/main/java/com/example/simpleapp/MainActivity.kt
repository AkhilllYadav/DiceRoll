package com.example.simpleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.btn)
        tv = findViewById(R.id.tv)

        btn.setOnClickListener{rollDice()}

    }

    private fun rollDice(){

        val randomNumb = (1..6).random()
        tv.text = randomNumb.toString()



    }

}