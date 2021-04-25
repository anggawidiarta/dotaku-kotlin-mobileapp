package com.dicoding.picodiploma.dotaku.activities.activity

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.picodiploma.dotaku.R
import android.content.Intent
import androidx.cardview.widget.CardView


class StrengthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_strength)
        supportActionBar?.elevation = 0f
        supportActionBar?.title = "Hero Type"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val cvHuman: CardView = findViewById(R.id.cv_human)
        val cvUndead: CardView = findViewById(R.id.cv_undead)
        val cvSentinel: CardView = findViewById(R.id.cv_sentinel)

        cvHuman.setOnClickListener {
            val HumanIntent = Intent(this@StrengthActivity, ListHeroActivity::class.java)
            HumanIntent.putExtra(ListHeroActivity.EXTRA_STATUS, 1)
            startActivity(HumanIntent)
        }

        cvUndead.setOnClickListener {
        val UndeadIntent = Intent(this@StrengthActivity, ListHeroActivity::class.java)
            UndeadIntent.putExtra(ListHeroActivity.EXTRA_STATUS, 2)
            startActivity(UndeadIntent)
         }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}