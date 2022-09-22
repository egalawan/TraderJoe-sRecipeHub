package com.example.traderjoesrecipehub

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.widget.*
import android.widget.EditText
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.traderjoesrecipehub.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // get reference to all views
        var username = findViewById(R.id.username) as EditText
        var password = findViewById(R.id.password) as EditText
        var btnRegister = findViewById(R.id.btnRegister) as Button
        var btnSignIn = findViewById(R.id.btnSignIn) as Button

        btnRegister.setOnClickListener {
            // clearing user_name and password edit text views on reset button click
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        // set on-click listener
        btnSignIn.setOnClickListener {
            val username = username.text
            val password = password.text
            Toast.makeText(this@MainActivity, username, Toast.LENGTH_LONG).show()

            // your code to validate the user_name and password combination
            // and verify the same

        }
    }
}