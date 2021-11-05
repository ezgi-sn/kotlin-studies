package com.example.estimationgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_estimation.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class EstimationActivity : AppCompatActivity() {
    private var randomNum=0
    private var count=5
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estimation)

        randomNum= Random.nextInt(101)
        Log.e("random num is", randomNum.toString())

        button.setOnClickListener {
            /*startActivity(Intent(this@EstimationActivity,ResultActivity::class.java))
            finish()*/
            count--
            val tahmin=editTextTahmin.text.toString().toInt()
            if(tahmin==randomNum){
                val intent=Intent(this@EstimationActivity,ResultActivity::class.java)
                intent.putExtra("sonuc",true)
                finish()
                startActivity(intent)
                return@setOnClickListener
            }
            if(tahmin>randomNum){
            textViewYardim.text="Azalt"
            textViewKalan.text="Kalan Hak : $count"
            }

            if(tahmin<randomNum){
                textViewYardim.text="Arttır"
                textViewKalan.text="Kalan Hak : $count"
            }
            if(count==0){
                val intent=Intent(this@EstimationActivity,ResultActivity::class.java)
                intent.putExtra("sonuc", false)
                finish()
                startActivity(intent)
            }
            editTextTahmin.setText("")
        }
    }
}