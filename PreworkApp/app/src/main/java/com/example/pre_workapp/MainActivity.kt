package com.example.pre_workapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

//this Kotlin file
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)

        //1. Add a button

        //2. Set rule for the button.
        findViewById<Button>(R.id.button).setOnClickListener {
            Log.i("Hamza", "Tapped on button")
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        }
    }
}