package com.om.simpledesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonLight=findViewById<Button>(R.id.btnLight)
        val layout=findViewById<LinearLayout>(R.id.linearLayout)


        val btnIntent=findViewById<Button>(R.id.btnDark)
        btnIntent.setOnClickListener {
            intent=Intent(applicationContext,SecondActivity2::class.java)
            startActivity(intent)
        }
    }
}