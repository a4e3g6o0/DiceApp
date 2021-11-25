package com.angel.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var diceOneImg: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.diceOneImg = findViewById(R.id.img_dice_one)

        val rollButtton = findViewById<Button>(R.id.btn_roll_dice);
        rollButtton.setOnClickListener {
            this.rollDice()
        }
    }

    fun rollDice() {
        val randomNumber = (1..6).random()

        val image = when (randomNumber) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6
            else -> R.drawable.dice_empty
        }

        this.diceOneImg.setImageResource(image)
    }
}