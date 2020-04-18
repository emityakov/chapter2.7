package com.example.task27

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText = findViewById<EditText>(R.id.editText)
        val checkBox = findViewById<CheckBox>(R.id.checkBox)
        val radioBtn1 = findViewById<RadioButton>(R.id.b1)
        val radioBtn2 = findViewById<RadioButton>(R.id.b2)
        val toogleBtn = findViewById<ToggleButton>(R.id.toggleButton)

        radioBtn1.setOnClickListener(View.OnClickListener {
            val s = "Hello world!"
            editText?.setText(s)
            Toast.makeText(applicationContext, "First RadioButton", Toast.LENGTH_SHORT)
                .show()
        })

        radioBtn2.setOnClickListener(View.OnClickListener {
            val s = "Greeatings!"
            editText?.setText(s)
            Toast.makeText(applicationContext, "Second RadioButton", Toast.LENGTH_SHORT)
                .show()
        })

        toogleBtn.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // The toggle is enabled/checked
                Toast.makeText(applicationContext, "Toggle on", Toast.LENGTH_SHORT).show()


                editText.setBackgroundColor(Color.GREEN)
            } else {
                // The toggle is disabled
                Toast.makeText(applicationContext, "Toggle off", Toast.LENGTH_SHORT).show()
                editText.setBackgroundColor(Color.GRAY)
            }
        }

        checkBox?.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(buttonView: CompoundButton, isChecked: Boolean) {
                if (checkBox!!.isChecked) {
                    Toast.makeText(applicationContext, "checked ", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(applicationContext, "unCkecked", Toast.LENGTH_SHORT).show()
                }
            }
        })

    }

}











