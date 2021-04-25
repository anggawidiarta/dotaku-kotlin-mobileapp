package com.dicoding.picodiploma.dotaku.activities.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.dicoding.picodiploma.dotaku.R


class LoreActivity : AppCompatActivity() {

    private lateinit var etData1: EditText
    private lateinit var bt_submitlore: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lore)
        etData1 = findViewById(R.id.et_data1)
        bt_submitlore = findViewById(R.id.bt_submitlore)

        bt_submitlore.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("data1", etData1.text.toString())
            val intent = Intent(this, ListLore::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

    }
}