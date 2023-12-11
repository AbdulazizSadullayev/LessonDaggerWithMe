package uz.coder.lessondaggerwithme.pace1.mashina.opshi

import uz.coder.lessondaggerwithme.pace1.mashina.Rangi
import uz.coder.lessondaggerwithme.pace1.mashina.ichi.Gaz
import uz.coder.lessondaggerwithme.pace1.mashina.ichi.Ichi
import uz.coder.lessondaggerwithme.pace1.mashina.ichi.Maytafon
import uz.coder.lessondaggerwithme.pace1.mashina.ichi.Rul
import uz.coder.lessondaggerwithme.pace1.mashina.ichi.Tormoz
import uz.coder.lessondaggerwithme.pace1.mashina.tashqari.Akumlator
import uz.coder.lessondaggerwithme.pace1.mashina.tashqari.Balon
import uz.coder.lessondaggerwithme.pace1.mashina.tashqari.BaqavoyOyna
import uz.coder.lessondaggerwithme.pace1.mashina.tashqari.Mator
import uz.coder.lessondaggerwithme.pace1.mashina.tashqari.Tashqarisi

class Component {
    fun getMashina():Mashina{
        val gaz = Gaz()
        val maytafon = Maytafon()
        val rul = Rul()
        val tormoz = Tormoz()
        val ichi = Ichi(gaz, maytafon, rul, tormoz)

        val akumlator = Akumlator()
        val balon = Balon()
        val baqavoyOyna = BaqavoyOyna()
        val mator = Mator()
        val tashqarisi = Tashqarisi(balon, akumlator, mator, baqavoyOyna)

        val rangi = Rangi()

        return Mashina(ichi, tashqarisi,rangi)
    }
//    fun inject(activity: Activity){
//        activity.rangi = Rangi()
//    }
}