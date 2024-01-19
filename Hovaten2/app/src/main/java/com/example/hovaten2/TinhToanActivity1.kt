package com.example.hovaten2

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class TinhToanActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val tt = findViewById<Button>(R.id.Sol)
        tt.setOnClickListener() {
            //Lay du lieu tu man hinh
            val A = findViewById<EditText>(R.id.hsa)
            val B = findViewById<EditText>(R.id.hsb)
            //Khai bao bien chuyen doi
            val a : Double
            val b : Double

            //Chuyen doi bien
            a = java.lang.Double.parseDouble(A.text.toString())
            b = java.lang.Double.parseDouble(B.text.toString())

            //Khai bao bien tinh toan va hien thi
            val hieu1 : Double
            val textView : TextView
            //Tinh toan
            hieu1 = a - b
            //Hien thi
            textView = findViewById<TextView>(R.id.x) as TextView
            textView.text = "Tong cac so la: " + String.format("%5.2f", hieu1)
        }
        val quayve = findViewById<Button>(R.id.qvtc)
        quayve.setOnClickListener()
        {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}