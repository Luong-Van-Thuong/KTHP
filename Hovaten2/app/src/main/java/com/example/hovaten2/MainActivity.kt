package com.example.hovaten2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val trangchu1 = findViewById<Button>(R.id.TrangPhu1)
        val trangchu2 = findViewById<Button>(R.id.TrangPhu2)
        trangchu1.setOnClickListener(){
            intent = Intent(this, TinhToanActivity1::class.java)
            startActivity(intent)
        }
        trangchu2.setOnClickListener(){
            intent = Intent(this, TinhToanActivitiy2::class.java)
            startActivity(intent)
        }
    }
}