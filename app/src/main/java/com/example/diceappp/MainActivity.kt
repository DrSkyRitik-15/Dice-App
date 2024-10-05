package com.example.diceappp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
lateinit var  tt: TextView
    lateinit var ii: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        tt = findViewById(R.id.textView)
         ii = findViewById(R.id.action_image)
        val bb: Button = findViewById(R.id.button_o)


        bb.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {
        var aa :Int = Random.nextInt(6) + 1
        val rol = when (aa) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
           else ->
               R.drawable.empty_dice

        }
        ii.setImageResource(rol)
        tt.text = aa.toString()
    }
}


