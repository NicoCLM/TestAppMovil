package com.co.appnicolascamacholesmes

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
//autor: Nicolas Camacho Lesmes
class CreateAccountActivity : AppCompatActivity() {

    lateinit var usernameInput: EditText
    lateinit var cityInput: EditText
    lateinit var emailInput: EditText
    lateinit var passInput: EditText
    lateinit var backBtn: Button
    lateinit var registerBtn: Button
    var userList: ArrayList<Usuario> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)
        try {

            usernameInput = findViewById(R.id.username_input)
            cityInput = findViewById(R.id.city_input)
            emailInput = findViewById(R.id.email_input)
            passInput = findViewById(R.id.pass_input)
            backBtn = findViewById(R.id.back_btn)
            registerBtn = findViewById(R.id.register_btn)

            registerBtn.setOnClickListener{
                val username = usernameInput.text.toString()
                val city = cityInput.text.toString()
                val email = emailInput.text.toString()
                val pass = passInput.text.toString()
                userList.add(Usuario(username, pass, email, city))
                Toast.makeText(this, "usuario: $username, ciudad: $city , email: $email , pass: $pass", Toast.LENGTH_LONG).show()

                //Para mirar los datos en la consola, hay que buscar la etiqueta DATA en el Logcat
                for (usuario in userList) {
                    Log.i("DATA","${usuario.username} - ${usuario.city} - ${usuario.email} - ${usuario.password}")
                }

            }

            backBtn.setOnClickListener{
                val i = Intent(this@CreateAccountActivity, MainActivity::class.java)
                startActivity(i)
            }
        } catch (e: Exception){
            Toast.makeText(this, "", Toast.LENGTH_LONG).show()
            print(e)
        }

    }
}