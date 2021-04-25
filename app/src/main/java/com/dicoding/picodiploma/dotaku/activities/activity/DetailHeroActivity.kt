package com.dicoding.picodiploma.dotaku.activities.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.dicoding.picodiploma.dotaku.R
import com.dicoding.picodiploma.dotaku.activities.data.HumanStrength
import com.dicoding.picodiploma.dotaku.activities.model.strHuman
import com.dicoding.picodiploma.dotaku.activities.data.UndeadStrength
import com.dicoding.picodiploma.dotaku.activities.model.strUndead

class DetailHeroActivity : AppCompatActivity() {

    private var listStrengthHero: ArrayList<strHuman> = arrayListOf()

    companion object{
        const val EXTRA_CATEGORY = "extra_category"
        const val EXTRA_POSITION = "extra_position"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_hero)
        supportActionBar?.elevation = 0f
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val category = intent.getStringExtra(EXTRA_CATEGORY)
        val position = intent.getIntExtra(EXTRA_CATEGORY, 0)

        val tvTitleName: TextView = findViewById(R.id.tv_item_name)
        val imgItem: ImageView = findViewById(R.id.img_item_photo)
        val tvDetail: TextView = findViewById(R.id.tv_item_detail)

        when(category){
            "strHuman" -> {
                supportActionBar?.title = "Strength Hero Type Human"
                listStrengthHero.addAll(HumanStrength.listStrengthHero)
                tvTitleName.setText(listStrengthHero[position].name)
                imgItem.setImageResource(listStrengthHero[position].photo)
                tvDetail.setText(listStrengthHero[position].detail)
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}