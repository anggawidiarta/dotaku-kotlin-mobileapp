package com.dicoding.picodiploma.dotaku.activities.data
import com.dicoding.picodiploma.dotaku.R
import com.dicoding.picodiploma.dotaku.activities.model.strHuman

object HumanStrength {
    private val strengthNames = arrayOf(
            "Tidehunter",
            "Lifestealer",
            "Axe"
    )

    private val strengthDetails = arrayOf(
            "Tidehunter adalah meranth atau makhluk penghuni bawah laut. Para leviathan seperti Tidehunter terkenal punya badan besar dan kekuatan yang mengerikan. Maelrawn disinyalir adalah seorang dewa kuno yang bersemayam di palung terdalam. Bahkan para pelaut percaya kalau ombak besar yang sampai ke tepian merupakan guncangan yang diakibatkan olehnya.\n\n",
            "Naix adalah seorang suku Oglodi yang telah dibuang oleh sukunya sendiri. Ia dibuang karena keinginannya untuk menguasai sihir hitam, Naix bersedia diasingkan oleh sukunya sendiri karena ia yakin tempatnya bukanlah disana melainkan jauh dari sukunya sendiri.\n\n",
            "Banyak legenda serta rumor yang beredar tentang Axe dan pasukan Red Mist Army. Ada yang mengatakan bahwa Axe adalah satu-satunya yang selamat dari perang selama tujuh hari yang di alami oleh Red Mist. Ada juga yang mengatakan bahwa Axe membunuh semua anggota dari Red Mist Army."


    )

    private val strengthImages = intArrayOf(
            R.drawable.tidehunter,
            R.drawable.lifestealer,
            R.drawable.axe
    )

    val listStrengthHero: ArrayList<strHuman>
    get() {
        val list = arrayListOf<strHuman>()
        for (position in strengthNames.indices){
            val strHuman = strHuman()
            strHuman.name = strengthNames[position]
            strHuman.detail = strengthDetails[position]
            strHuman.photo = strengthImages[position]
            list.add(strHuman)
        }
        return list
    }

}