package com.dicoding.picodiploma.dotaku.activities.fragment
import com.dicoding.picodiploma.dotaku.R
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText



class LaporanFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_laporan, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn_kirim = view.findViewById(R.id.btn_kirim) as Button
        val et_nama = view.findViewById(R.id.et_nama) as EditText
        val et_saran = view.findViewById(R.id.et_saran) as EditText


        val LaporanTerkirim = LaporanTerkirimFragment()

        btn_kirim.setOnClickListener {

            val bundle = Bundle()
            bundle.putString(LaporanTerkirimFragment.EXTRA_NAME, "Terimakasih Atas Sarannya \n"+et_nama.text.toString())

            val saran = "Ini Saran yang anda berikan : \n" + et_saran.text.toString()

            LaporanTerkirim.arguments = bundle
            LaporanTerkirim.saran = saran

            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.laporan, LaporanTerkirim, LaporanTerkirimFragment::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
            }
        }
    }

}
