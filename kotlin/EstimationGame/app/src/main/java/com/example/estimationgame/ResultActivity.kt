package com.example.estimationgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val sonuc=intent.getBooleanExtra("sonuc",false)
        if(sonuc){
            textViewSonuc.text="Kazandınız"
            imageViewSonuc.setImageResource(R.drawable.mutlu_resim)
        }
        else{
            textViewSonuc.text="Kaybettiniz"
            imageViewSonuc.setImageResource(R.drawable.uzgun_resim)
        }
        buttonTekrar.setOnClickListener {
            startActivity(Intent(this@ResultActivity,EstimationActivity::class.java))
            finish()
        }
    }
}