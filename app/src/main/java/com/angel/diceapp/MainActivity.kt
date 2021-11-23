package com.angel.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var randomNumberTxt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.randomNumberTxt = findViewById<TextView>(R.id.text_view_random_number)

        val rollButtton = findViewById<Button>(R.id.btn_roll_dice);
        rollButtton.setOnClickListener {
            this.rollDice()
        }
    }

    fun rollDice() {
        val randomNumber = (1..6).random()
        randomNumberTxt.text = randomNumber.toString()
    }
}