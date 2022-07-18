package com.example.netflixcopy

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.netflixcopy.databinding.CardTasarimBinding

class FilmlerAdapter(var mContext : Context, var fimlerListesi:List<Filmler>) :
        RecyclerView.Adapter<FilmlerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(tasarim:CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root) {
        var tasarim: CardTasarimBinding
        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = CardTasarimBinding.inflate(layoutInflater, parent , false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val film =fimlerListesi.get(position)
        holder.tasarim.imageView.setImageResource(
            mContext.resources.getIdentifier(film.filmResimAdi, "drawable",mContext.packageName)
        )
    }

    override fun getItemCount(): Int {
        return fimlerListesi.size
    }
}