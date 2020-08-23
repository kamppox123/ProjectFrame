package com.example.mainframe

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_go.setOnClickListener {
            button_go.setText("razdwa")
            var message =Toast.makeText(applicationContext, "Dzie", Toast.LENGTH_LONG)
            message.show()

        }
    }
}


