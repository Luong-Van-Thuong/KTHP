package com.example.hovaten1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class TinhToanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)
        val C : String = intent.getStringExtra("C").toString()
        val D : String = intent.getStringExtra("D").toString()
        //Hien thi gia tri C, D
        val textView1 : TextView = findViewById<EditText>(R.id.GiaTriC)
        textView1.text = C
        val textView2 : TextView = findViewById<EditText>(R.id.GiaTriD)
        textView2.text = D

        val tong : Double = java.lang.Double.parseDouble(D) + java.lang.Double.parseDouble(C)

        val strSol : String = String.format("%5.2f", tong )
        val textView : TextView = findViewById<EditText>(R.id.KQ)
        textView.text = strSol

        val btn2 = findViewById<Button>(R.id.quayVe)
        btn2.setOnClickListener(){
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}