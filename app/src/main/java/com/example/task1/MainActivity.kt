package com.example.task1

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun setText(view : View){
        val labelText = findViewById<TextView>(R.id.textViewResult)

        val bf = NumberExercise()
        labelText.text = "Список - " + bf.numbers + "; \n сумма отрицательных: " + bf.exerciseTwo ()["negative"] + "; \n количество положительных: " + bf.exerciseTwo ()["positive"]

    }
}