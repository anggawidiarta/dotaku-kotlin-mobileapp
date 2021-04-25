package com.dicoding.picodiploma.dotaku.activities.adapter

import android.content.ClipData
import com.dicoding.picodiploma.dotaku.R
import com.dicoding.picodiploma.dotaku.activities.model.strHuman
import com.dicoding.picodiploma.dotaku.activities.activity.DetailHeroActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class HumanStrengthAdapter (private val  listData: ArrayList<strHuman>) : RecyclerView.Adapter<HumanStrengthAdapter.ListViewHolder>() {

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        val btnDetail: Button = itemView.findViewById(R.id.btn_detail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.rv_list, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val data = listData[position]
        Glide.with(holder.itemView.context)
                .load(listData[position].photo)
                .apply(RequestOptions().override(55, 55))
                .into(holder.imgPhoto)
        holder.tvName.text = data.name

        holder.btnDetail.setOnClickListener {
            val context = it.context
            val detailIntent = Intent(context, DetailHeroActivity::class.java)
            detailIntent.putExtra(DetailHeroActivity.EXTRA_CATEGORY, "strHuman")
            detailIntent.putExtra(DetailHeroActivity.EXTRA_POSITION, position)
            context.startActivity(detailIntent)
        }

    }

}