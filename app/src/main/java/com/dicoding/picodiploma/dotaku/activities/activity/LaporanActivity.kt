package com.dicoding.picodiploma.dotaku.activities.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.picodiploma.dotaku.R
import com.dicoding.picodiploma.dotaku.activities.fragment.LaporanFragment

class LaporanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_laporan)

        val laporanFragment = LaporanFragment()
        val fragment = supportFragmentManager.findFragmentByTag(LaporanFragment::class.java.simpleName)

        if(fragment !is LaporanFragment){
            supportFragmentManager.beginTransaction()
                .add(R.id.laporan, laporanFragment, LaporanFragment::class.java.simpleName)
                .commit()
        }
    }
}