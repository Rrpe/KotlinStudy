package com.example.rrpe.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.widget.TextViewCompat
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var editTxt: EditText? = null
    private var viewTxt: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTxt = findViewById(R.id.edit_txt) as EditText
        viewTxt = findViewById(R.id.view_txt) as TextView

        editTxt?.setOnKeyListener { _, _, _ ->
            viewTxt?.text = editTxt?.text.toString()
            false
        }
    }
}
