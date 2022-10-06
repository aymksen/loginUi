 package com.test.loginui

import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity



 class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logInLayout = findViewById<LinearLayout>(R.id.logInLayout)
        val signUpLayout = findViewById<LinearLayout>(R.id.signUpLayout)
        val signUp = findViewById<TextView>(R.id.signUp)
        val logIn = findViewById<TextView>(R.id.logIn)

        signUp.setOnClickListener(){
            signUp.background = resources.getDrawable(R.drawable.switch_trcks,null)
            signUp.setTextColor(resources.getColor(R.color.textColor,null))

            logIn.background = null
            signUpLayout.visibility = View.VISIBLE
            logInLayout.visibility = View.GONE
            logIn.setTextColor(resources.getColor(R.color.pinkColor,null))
        }

        logIn.setOnClickListener(){
            logIn.background = resources.getDrawable(R.drawable.switch_trcks,null)
            logIn.setTextColor(resources.getColor(R.color.textColor,null))

            signUp.background = null
            logInLayout.visibility = View.VISIBLE
            signUpLayout.visibility = View.GONE
            signUp.setTextColor(resources.getColor(R.color.pinkColor,null))
        }


        val button = findViewById<Button>(R.id.SignIn)
        val editTextTextEmailAddress = findViewById<TextView>(R.id.eMail)
        val editTextTextPassword = findViewById<TextView>(R.id.password)

        button.setOnClickListener{


            if(editTextTextEmailAddress.text.isNullOrBlank()&&editTextTextPassword.text.isNullOrBlank()){
                Toast.makeText(this,"Please fill the required fields", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "${editTextTextEmailAddress.text} is logged in", Toast.LENGTH_SHORT).show()
            }

        }



        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val w: Window = window // in Activity's onCreate() for instance
            w.setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
            )
        }


    }


}

 private fun TextView.hasOnClickListeners(function: () -> Unit) {

 }
