package com.example.myassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //variebles

        val numbertext = findViewById<EditText>(R.id.editTextNumber)
        val button = findViewById<Button>(R.id.button3)
        val button2 = findViewById<Button>(R.id.button)
        val age = findViewById<TextView>(R.id.textView2)


        //generate aage button code
        button?.setOnClickListener {
            val number = numbertext.text.toString().toInt()

            if (number == 51) {
                age.text = "James Gandolfini " +
                        "Known for his role as Tony soprano in the famous tv series The sopranos"
            } else if (number == 48) {
                age.text = "Whitney Houston " +
                        "Famous RnB singer and actress"
            } else if (number == 28) {
                age.text = "Heath ledger " +
                        "Famous actor know for he’s role in the dark knight "
            } else if (number == 32) {
                age.text = "Bruce lee " +
                        "Famous martial artist and actor "
            } else if (number == 44) {
                age.text = "Steve Erwin " +
                        "Also known as The crocodile hunter"
            } else if (number == 80) {
                age.text = "Marlon Brando " +
                        "Famous actor known for his performance in The godfather as vito corleone "
            } else if (number == 35) {
                age.text = "Kiernan Forbes " +
                        "Famous South African artist also known as AKA"
            } else if (number == 38) {
                age.text = "anthony johnson" +
                        "famous ufc fighter"

            } else if (number == 26) {
                age.text = " maclcom mccormick" +
                        "famous artist know as mac miller"

            } else if (number == 34) {
                age.text = "richardo markhado" +
                        "famous south african artist"
            } else {
                age.text = "The age you entered is unknown in this application"
            }
            if (number < 20) {
                age.text = "invalid input "
            }
            if (number > 100) {
                age.text = "Invalid input"
            }
        }//setting clear button
        button2?.setOnClickListener {
            numbertext.text.clear()
            val value=age
            if (value == age){
                age.setText("")}


            }
        }
    }

