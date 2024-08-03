package com.co.appnicolascamacholesmes

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

//autor: Nicolas Camacho Lesmes
class MainActivity : AppCompatActivity() {

    lateinit var emailInput: EditText
    lateinit var passInput: EditText
    lateinit var loginBtn: Button
    lateinit var registerBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            emailInput = findViewById(R.id.email_input)
            passInput = findViewById(R.id.pass_input)
            loginBtn = findViewById(R.id.login_btn)
            registerBtn = findViewById(R.id.register_btn)

            loginBtn.setOnClickListener{
                val email = emailInput.text.toString()
                val pass = passInput.text.toString()
                Log.i("DATA", "Login email: ${email}, password: ${pass}")
                Toast.makeText(this, "Inicio de sesion exitoso", Toast.LENGTH_LONG).show()
                val intent = Intent(this@MainActivity, HomeActivity::class.java)
                startActivity(intent)
            }

            registerBtn.setOnClickListener{
                val intent = Intent(this@MainActivity, CreateAccountActivity::class.java)
                startActivity(intent)
            }

        } catch (e: Exception){
            print(e)
        }

    }
}