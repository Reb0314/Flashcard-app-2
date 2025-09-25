package com.example.flashcardapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val flashcard_choice1=findViewById<TextView>(R.id.choice1)
        val flashcard_choice2=findViewById<TextView>(R.id.choice2)
        val flashcard_choice3=findViewById<TextView>(R.id.choice3)
       // val =findViewById<Button>(R.id.eye_ide_)
        val show=findViewById<ImageView>(R.id.eye_show)
        val hide=findViewById<ImageView>(R.id.eye_hide)
        val changeActivity=findViewById<ImageView>(R.id.addplus)

        show.setOnClickListener{
            if (flashcard_choice1.isVisible){
                flashcard_choice1.isVisible = false
                flashcard_choice2.isVisible = false
                flashcard_choice3.isVisible= true
                hide.isVisible= true
            }else {
                flashcard_choice1.isVisible = true
                flashcard_choice2.isVisible = true
                flashcard_choice3.isVisible= true
                hide.isVisible= false
            }

            changeActivity.setOnClickListener {
                fun launchComposeView(){
                }
                launchComposeView()
            }
        }
    }
}