package com.example.hovaten2

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class TinhToanActivitiy2  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val kp = findViewById<Button>(R.id.tong)
        kp.setOnClickListener(){
            //lay du lieu tu ban phim
            val A = findViewById<EditText>(R.id.hsa)
            val B = findViewById<EditText>(R.id.hsb)
            //Chuyen string sang double
            val a : Double = java.lang.Double.parseDouble(A.text.toString())
            val b : Double = java.lang.Double.parseDouble(B.text.toString())

            //Tinh tong
            val tong2So : Double = a + b
            //Hien thi
            val textView: TextView = findViewById<TextView>(R.id.x) as TextView
            textView.text = "Tong hai so: " + String.format("%5.2f", tong2So)
        }


        //Chuyen ve trang 1
        val trang1 = findViewById<Button>(R.id.trang1)
        trang1.setOnClickListener(){
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}