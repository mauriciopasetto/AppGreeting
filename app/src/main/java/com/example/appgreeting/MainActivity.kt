package com.example.appgreeting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cliqueDia(view:View){
        var tvGreeting = findViewById<TextView>(R.id.tv_greeting)
        var btnDia =  findViewById<TextView>(R.id.bt_dia)
        var btnNoite =  findViewById<TextView>(R.id.bt_noite)
        tvGreeting.setText("Bom Dia!")
        btnDia.isEnabled = false;
        btnNoite.isEnabled = true;
    }

    fun cliqueNoite(view:View){
        var tvGreeting = findViewById<TextView>(R.id.tv_greeting)
        var btnDia =  findViewById<TextView>(R.id.bt_dia)
        var btnNoite =  findViewById<TextView>(R.id.bt_noite)
        tvGreeting.setText("Boa Noite!")
        btnDia.isEnabled = true;
        btnNoite.isEnabled = false;
    }



}