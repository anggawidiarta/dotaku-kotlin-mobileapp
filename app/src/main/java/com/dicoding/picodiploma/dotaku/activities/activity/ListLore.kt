package com.dicoding.picodiploma.dotaku.activities.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.dicoding.picodiploma.dotaku.R

class ListLore : AppCompatActivity() {
    private lateinit var tvData1 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_lore)

        tvData1 = findViewById(R.id.tv_data1)
        val bundle = intent.extras
        if (bundle != null) {
            tvData1.setText(bundle.getString("data1"))
        }
    }
}