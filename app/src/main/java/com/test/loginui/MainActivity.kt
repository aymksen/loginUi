 package com.test.loginui

import android.annotation.SuppressLint
import android.content.Intent
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

    @SuppressLint("CutPasteId", "UseCompatLoadingForDrawables")
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
        val EmailField = findViewById<TextView>(R.id.eMail)
        val PasswordField = findViewById<TextView>(R.id.password)







        button.setOnClickListener{


            if(EmailField.text.isNullOrBlank()||PasswordField.text.isNullOrBlank()){
                Toast.makeText(this,"Please fill the required fields", Toast.LENGTH_SHORT).show()

            }
            else{
                Toast.makeText(this, "${EmailField.text} is logged in", Toast.LENGTH_SHORT).show()



                val Username = EmailField.text.toString()

                val intent = Intent(this@MainActivity,NewActivity::class.java)
                intent.putExtra("Name",Username)
                startActivity(intent)


            }

        }



        val w: Window = window // Hides status bar
        w.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )




    }


}
