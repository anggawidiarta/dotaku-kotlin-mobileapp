package com.dicoding.picodiploma.dotaku.activities.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.picodiploma.dotaku.activities.adapter.HumanStrengthAdapter
import com.dicoding.picodiploma.dotaku.activities.model.strHuman
import com.dicoding.picodiploma.dotaku.activities.model.strUndead
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.dicoding.picodiploma.dotaku.R
import com.dicoding.picodiploma.dotaku.activities.data.HumanStrength

class ListHeroActivity: AppCompatActivity() {

    companion object{
        const val  EXTRA_STATUS = "extra_status"
    }

    private lateinit var rvList: RecyclerView
    private var list1: ArrayList<strHuman> = arrayListOf()
    //private var list2: ArrayList<strUndead> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_hero)
        supportActionBar?.elevation = 0f
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        rvList = findViewById(R.id.tv_item_name)
        rvList.setHasFixedSize(true)

        val status = intent.getIntExtra(EXTRA_STATUS, 0)
        var title: TextView = findViewById(R.id.list_title)

        list1.addAll(HumanStrength.listStrengthHero)

        when(status){
            1 -> {
                title.setText("Human Type")
                supportActionBar?.title = "List Human Type"
                showHeroList()
            }
        }

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener{
            view -> Snackbar.make(view, "Add Hero", Snackbar.LENGTH_LONG)
                .setAction("ActionBegin", null).show()
        }

    }

    private fun showHeroList(){
        rvList.layoutManager = LinearLayoutManager(this)
        val listAdapter = HumanStrengthAdapter(list1)
        rvList.adapter = listAdapter
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}