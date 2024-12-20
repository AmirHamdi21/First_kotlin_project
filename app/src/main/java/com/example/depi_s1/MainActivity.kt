package com.example.depi_s1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var button : Button
    lateinit var button2 : Button
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button6)
        button2 = findViewById(R.id.button7)
        textView = findViewById(R.id.textView)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        button.setOnClickListener{

            leftButtonClicked()
        }

        button2.setOnClickListener{

            rightButtonClicked()
        }

    }

    fun rightButtonClicked(){
        textView.text = "Below button clicked"
        button2.text = "clicked"
//        button2.setBackgroundColor()
        button.text = "Upper Button"
    }

    fun leftButtonClicked(){
        textView.text = "Upper button clicked"
        button.text = "clicked"
//        button2.setBackgroundColor()
        button2.text = "Below Button"
    }
}