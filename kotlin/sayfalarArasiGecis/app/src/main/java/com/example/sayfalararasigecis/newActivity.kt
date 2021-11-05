package com.example.sayfalararasigecis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_new.*

class newActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        button3.setOnClickListener {
            val newIntent= Intent(this@newActivity,secondNew::class.java)
            startActivity(newIntent)
        }
    }

    override fun onBackPressed() {
        val newIntent=Intent(Intent.ACTION_MAIN)
        newIntent.addCategory(Intent.CATEGORY_HOME)
        newIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(newIntent)
    }
}