package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.ImageView
//import kotlin.random.Random
import java.util.*
import java.util.Random

//class MainActivity() : AppCompatActivity(), Parcelable {
//    constructor(parcel: Parcel) : this() {
//    }
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        val rollButton: Button = findViewById(R.id.button_id)
//
//        rollButton.setOnClickListener(){
//           val randomNumber = Random().nextInt(6) + 1
//        }
//
//    }
//
//}

class MainActivity : AppCompatActivity(){
    lateinit var rollButton: Button
    lateinit var diceOne: ImageView
    lateinit var diceTwo: ImageView
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
                 rollButton = findViewById(R.id.button_id)
                 diceOne = findViewById(R.id.firstDice)
                 diceTwo = findViewById(R.id.secondDice)


                rollButton.setOnClickListener() {
                    val randomNumber = Random().nextInt(6) + 1

                    val resourceDrawable1 = when (randomNumber) {
                        1 -> R.drawable.dice1
                        2 -> R.drawable.dice2
                        3 -> R.drawable.dice3
                        4 -> R.drawable.dice4
                        5 -> R.drawable.dice5
                        else -> R.drawable.dice6
                    }
                    diceOne.setImageResource(resourceDrawable1)
                    
                        val randomNumber2 = Random().nextInt(6) + 1

                        val resourceDrawable2 = when (randomNumber2) {
                            1 -> R.drawable.dice1
                            2 -> R.drawable.dice2
                            3 -> R.drawable.dice3
                            4 -> R.drawable.dice4
                            5 -> R.drawable.dice5
                            else -> R.drawable.dice6
                        }

                        diceTwo.setImageResource(resourceDrawable2)
                    }


    }
}