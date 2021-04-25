package com.dicoding.picodiploma.dotaku.activities.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.picodiploma.dotaku.R
import android.view.View
import androidx.cardview.widget.CardView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cvStr: CardView = findViewById(R.id.cv_str)
        //val cvAgi: CardView = findViewById(R.id.cv_agi)
        //val cvInt: CardView = findViewById(R.id.cv_int)
        val cvLap: CardView = findViewById(R.id.cv_laporan)
        val cvProf: CardView = findViewById(R.id.cv_profile)


        cvStr.setOnClickListener {
            val strIntent = Intent(this@MainActivity, StrengthActivity::class.java)
            startActivity(strIntent)
        }

        cvProf.setOnClickListener {
            val profileIntent = Intent(this@MainActivity, ProfilActivity::class.java)
            startActivity(profileIntent)
        }

        cvLap.setOnClickListener {
            val laporanIntent = Intent(this@MainActivity, LaporanActivity::class.java)
            startActivity(laporanIntent)
        }

    }

}