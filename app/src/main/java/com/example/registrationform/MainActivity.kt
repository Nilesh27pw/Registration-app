package com.example.registrationform

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var name = ""
    var phno = ""
    var email=""
    var gender=""
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SendButton.setOnClickListener {
            getData(nameTextBox.text.toString(),phonoText.text.toString(), Email.text.toString())
            Toast.makeText(applicationContext,name,Toast.LENGTH_SHORT).show()
            var genderId = GenderRadioGroup.checkedRadioButtonId
            if(genderId != -1){
                val selected_gender : RadioButton = findViewById(genderId)
                gender = selected_gender.text.toString()
            }
            var intent =Intent(
               this,Main2Activity::class.java).apply{
                putExtra("Reference",name)
                putExtra("refer",phno)
                putExtra("email",email)
                putExtra("gender",gender)
            }
           startActivity(intent)
        }
    }
    private fun getData(nam:String, phn:String, emai:String){
        name= nam
        phno=phn
        email=emai
    }
}
