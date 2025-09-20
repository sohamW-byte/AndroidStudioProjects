package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare a variable to hold the current count
    private var count: Int = 0

    // Declare variables for the UI elements
    private lateinit var countTextView: TextView
    private lateinit var incrementButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the UI elements by finding them by their IDs
        countTextView = findViewById(R.id.count_text_view)
        incrementButton = findViewById(R.id.increment_button)

        // Set up the button's click listener
        incrementButton.setOnClickListener {
            // Increment the count when the button is clicked
            count++
            // Update the TextView with the new count
            countTextView.text = count.toString()
        }
    }
}
