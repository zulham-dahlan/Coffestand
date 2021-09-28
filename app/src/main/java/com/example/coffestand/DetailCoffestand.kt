package com.example.coffestand

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide


class DetailCoffestand : AppCompatActivity() {
    companion object{
        const val EXTRA_NAMA = "extra_nama"
        const val EXTRA_ALAMAT = "extra_alamat"
        const val EXTRA_JADWAL = "extra_jadwal"
        const val EXTRA_RATING = "extra_rating"
        const val EXTRA_IMAGE = "extra_image"
        const val EXTRA_KOORDINAT = "extra_koordinat"
    }

    private lateinit var btnMaps : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_coffestand)

        val tvNama : TextView = findViewById(R.id.tv_nama)
        val tvAlamat : TextView = findViewById(R.id.tv_alamat)
        val tvJadwal : TextView = findViewById(R.id.tv_waktu)
        val tvRating : TextView = findViewById(R.id.tv_rating)
        val imgProfil : ImageView = findViewById(R.id.img_profil)
        btnMaps = findViewById(R.id.btn_maps)

        tvNama.text = intent.getStringExtra(EXTRA_NAMA)
        tvAlamat.text = intent.getStringExtra(EXTRA_ALAMAT)
        tvJadwal.text = intent.getStringExtra(EXTRA_JADWAL)
        tvRating.text = getString(R.string.example_rating,intent.getStringExtra(EXTRA_RATING))
        Glide.with(this).load(intent.getIntExtra(EXTRA_IMAGE,0)).into(imgProfil)

        val urlKoordinat = intent.getStringExtra(EXTRA_KOORDINAT)
        btnMaps.setOnClickListener {
            showMaps(Uri.parse(urlKoordinat))
        }
    }

    private fun showMaps(geoLocation : Uri){
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = geoLocation
        }
        if (intent.resolveActivity(packageManager) != null){
            startActivity(intent)
        }
    }


}