package com.example.sayfalararasigecis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class secondNew : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_new)
    }

    override fun onBackPressed() {
        val newIntent=Intent(this@secondNew,MainActivity::class.java)
        startActivity(newIntent)
    }
}