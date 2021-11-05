package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class FilmlerAdapter(private val mContext:Context, private val filmlerListesi:List<Filmler>)
    :RecyclerView.Adapter<FilmlerAdapter.CardTasarimNesneleriniTutucu>()
{
    inner class CardTasarimNesneleriniTutucu(view:View):RecyclerView.ViewHolder(view){
        var imageViewFilmPoster:ImageView
        var textViewBaslik:TextView
        var textViewFiyat:TextView
        var button:Button
        init {
            imageViewFilmPoster=view.findViewById(R.id.imageViewFilmPoster)
            textViewBaslik=view.findViewById(R.id.textViewBaslik)
            textViewFiyat=view.findViewById(R.id.textViewFiyat)
            button=view.findViewById(R.id.button)
        }
    }

    override fun getItemCount(): Int {
        return filmlerListesi.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimNesneleriniTutucu {
    val tasarim=LayoutInflater.from(mContext).inflate(R.layout.card_film_tasarim,parent,false)
     return CardTasarimNesneleriniTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimNesneleriniTutucu, position: Int) {
        val film=filmlerListesi[position]
        holder.textViewBaslik.text=film.filmAd
        holder.textViewFiyat.text="${film.filmFiyat} TL"
        holder.imageViewFilmPoster.setImageResource(mContext.resources.getIdentifier(film.filmResimAd,"drawable",mContext.packageName))
        holder.button.setOnClickListener {
            Toast.makeText(mContext, "${film.filmAd} sepete eklendi", Toast.LENGTH_SHORT)
        }
    }
}