package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var filmlerList: ArrayList<Filmler>
    private lateinit var adapter: FilmlerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv.setHasFixedSize(true)
        rv.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        filmlerList=ArrayList<Filmler>()
        val f1=Filmler(1,"Civil War", "cw",39.90)
        val f2=Filmler(2,"Endgame","endgame", 29.90)
        val f3=Filmler(3,"First Avenger","fa",19.90)
        val f4=Filmler(4,"Infinity War", "iw", 29.90)
        val f5=Filmler(5, "Winter Soldier", "ws", 39.90)
        filmlerList.add(f1)
        filmlerList.add(f2)
        filmlerList.add(f3)
        filmlerList.add(f4)
        filmlerList.add(f5)
        adapter= FilmlerAdapter(this,filmlerList)
        rv.adapter=adapter
    }
}