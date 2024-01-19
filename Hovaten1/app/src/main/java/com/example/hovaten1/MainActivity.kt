package com.example.hovaten1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Lay du lieu tu cac id
        val C = findViewById<EditText>(R.id.C)
        val D = findViewById<EditText>(R.id.D)
        //chuyen du lieu sang tinhtoanactivity
        val btn1 = findViewById<Button>(R.id.btn)
        btn1.setOnClickListener(){
            intent = Intent(this, TinhToanActivity::class.java)
            intent.putExtra("C", C.text.toString())
            intent.putExtra("D", D.text.toString())
            startActivity(intent)
        }
    }
}