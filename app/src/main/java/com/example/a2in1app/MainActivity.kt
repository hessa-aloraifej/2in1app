package com.example.a2in1app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberGuess = findViewById<Button>(R.id.button)
        val numberPhrase = findViewById<Button>(R.id.button2)
        // val clMain = findViewById<ConstraintLayout>(R.id.clMain)
        numberGuess.setOnClickListener {
            val intent = Intent(this, GuessNumberActivity::class.java)
            startActivity(intent)
        }
        numberPhrase.setOnClickListener {
            val intent = Intent(this, GuessPhraseActivity::class.java)
            startActivity(intent)
        }


    }

}