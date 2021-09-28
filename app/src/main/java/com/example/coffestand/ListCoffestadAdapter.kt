package com.example.coffestand

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ListCoffestadAdapter(private val listCoffestand : ArrayList<Coffestand> ) : RecyclerView.Adapter<ListCoffestadAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvNama : TextView = itemView.findViewById(R.id.tv_nama)
        var tvAlamat : TextView = itemView.findViewById(R.id.tv_alamat)
        var imgProfil : ImageView = itemView.findViewById(R.id.img_profil)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_coffestand,parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val coffestand = listCoffestand[position]

        Glide.with(holder.itemView.context)
            .load(coffestand.photo)
            .into(holder.imgProfil)

        holder.tvNama.text = coffestand.name
        holder.tvAlamat.text = coffestand.address

        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context,DetailCoffestand::class.java)
            intent.putExtra(DetailCoffestand.EXTRA_NAMA,coffestand.name)
            intent.putExtra(DetailCoffestand.EXTRA_ALAMAT,coffestand.address)
            intent.putExtra(DetailCoffestand.EXTRA_JADWAL,coffestand.openTime)
            intent.putExtra(DetailCoffestand.EXTRA_RATING,coffestand.rating)
            intent.putExtra(DetailCoffestand.EXTRA_KOORDINAT,coffestand.koordinat)
            intent.putExtra(DetailCoffestand.EXTRA_IMAGE,coffestand.photo)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listCoffestand.size
    }
}