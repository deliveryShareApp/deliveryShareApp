package com.cookandroid.dsa_start

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar

class SetAddress : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_address)

        val adrTb = findViewById<Toolbar>(R.id.adrTb)
        setSupportActionBar(adrTb)

        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.adrTb -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}