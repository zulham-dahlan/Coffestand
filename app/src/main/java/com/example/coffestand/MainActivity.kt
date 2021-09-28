package com.example.coffestand

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvCoffestand: RecyclerView
    private var list : ArrayList<Coffestand> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvCoffestand = findViewById(R.id.rv_coffestand)
        rvCoffestand.setHasFixedSize(true)

        list.addAll(CoffestandData.listData)
        rvCoffestand.layoutManager = LinearLayoutManager(this)
        val listCoffestandAdapter = ListCoffestadAdapter(list)
        rvCoffestand.adapter = listCoffestandAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.ic_about -> {
                val intent = Intent(this,AboutActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}