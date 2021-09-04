package com.natashazahr.lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtText : EditText
    private lateinit var btnSubmit : Button
    private lateinit var tvTampil : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtText = findViewById(R.id.et_input)
        btnSubmit = findViewById(R.id.btn_submit)
        tvTampil = findViewById(R.id.tv_tampil)


        btnSubmit.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        if(p0.id == R.id.btn_submit) {
            val isiEditText = edtText.text.toString()
            tvTampil.text = isiEditText
        }
    }
}