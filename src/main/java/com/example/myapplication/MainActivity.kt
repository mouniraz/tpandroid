package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nom=findViewById<EditText>(R.id.Name)
        val prenom=findViewById<EditText>(R.id.Firstname)
        val  button=findViewById<Button>(R.id.valide)
        val message=findViewById<TextView>(R.id.message)
            button.setOnClickListener {
                if(nom.text.isEmpty()||prenom.text.isEmpty())
               // Toast.makeText(applicationContext,"error champs vide",Toast.LENGTH_LONG).show()
                Snackbar.make(button,"error champs vide",Snackbar.LENGTH_LONG).show()
                   else
                    message.text="bonjour ${nom.text}  ${prenom.text}"
            }
    }



}