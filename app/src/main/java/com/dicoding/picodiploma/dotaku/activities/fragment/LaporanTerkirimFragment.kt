package com.dicoding.picodiploma.dotaku.activities.fragment

import com.dicoding.picodiploma.dotaku.R
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class LaporanTerkirimFragment : Fragment() {
    lateinit var tv_nama: TextView
    lateinit var tv_saran: TextView
    lateinit var btn_back: Button

    var saran: String? = null

    companion object {
        val EXTRA_NAME = "extra_name"
        val EXTRA_SARAN = "extra_saran"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tv_nama = view.findViewById(R.id.tv_nama) as TextView
        tv_saran = view.findViewById(R.id.tv_saran) as TextView
        btn_back = view.findViewById(R.id.btn_back) as Button

        val laporanFragment = LaporanFragment()

        btn_back.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.laporan, laporanFragment, LaporanFragment::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
            }
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        if(savedInstanceState != null){
            val description = savedInstanceState.getString(EXTRA_SARAN)
            saran = description
        }

        if(arguments != null){
            val name = arguments?.getString(EXTRA_NAME)
            tv_nama.text = name
            tv_saran.text = saran
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_laporan_terkirim, container, false)
    }

}

