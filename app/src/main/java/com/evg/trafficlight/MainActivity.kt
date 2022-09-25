package com.evg.trafficlight

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rootLayout : ConstraintLayout = findViewById(R.id.root_layout)
        val textView : TextView = findViewById(R.id.textView_color)
        val buttonRed : Button = findViewById(R.id.button_red)
        val buttonYellow : Button = findViewById(R.id.button_yellow)
        val buttonGreen : Button = findViewById(R.id.button_green)

        buttonRed.setOnClickListener {
            textView.text = "Красный"
            rootLayout.setBackgroundColor(resources.getColor(R.color.red, null))
        }
        buttonYellow.setOnClickListener {
            textView.text = "Жёлтый"
            rootLayout.setBackgroundColor(resources.getColor(R.color.yellow, null))
        }
        buttonGreen.setOnClickListener {
            textView.text = "Зелёный"
            rootLayout.setBackgroundColor(resources.getColor(R.color.green, null))
        }



    }
}