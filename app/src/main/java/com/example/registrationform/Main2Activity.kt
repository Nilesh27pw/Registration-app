package com.example.registrationform

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {
    private lateinit var obtainedname: String
    private lateinit var phone:String
    private lateinit var EMA:String
    private lateinit var gen:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        obtainedname =intent.getStringExtra("Reference")
        phone=intent.getStringExtra("refer")
        EMA= intent.getStringExtra("email")
        gen=intent.getStringExtra("gender")
        if(gen == "male")
           hellotext.text= "Hello Mr.${obtainedname}"
        else
            hellotext.text= "Hello Miss.${obtainedname}"
        phonee.text="Your Mobile No.:-\n${phone}"
        emaill.text="Your mail Id :-\n${EMA}"
        genn.text="Your gender is ${gen}"
        button.setOnClickListener {
            var intent = Intent(
                this, MainActivity2::class.java
            ).apply {
            }
            startActivity(intent)
        }
    }
}
