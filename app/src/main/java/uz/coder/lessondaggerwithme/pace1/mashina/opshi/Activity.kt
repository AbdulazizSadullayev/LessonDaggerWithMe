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
import javax.inject.Inject

class Activity {
//    @Inject
//    lateinit var rangi: Rangi
//
    @Inject
    lateinit var mashina: Mashina

    init {
        DaggerNewComponent.create().inject(this)
    }

//    val rangi: Rangi
//        get() = DaggerNewComponent.create().getRangi()



}