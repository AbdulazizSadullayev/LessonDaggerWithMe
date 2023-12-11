package uz.coder.lessondaggerwithme.pace1.mashina.opshi

import dagger.Module
import dagger.Provides
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

@Module
class CarModule {

    @Provides
    fun mashina(ichi: Ichi,tashqarisi: Tashqarisi,rangi: Rangi):Mashina{
        return Mashina(ichi, tashqarisi, rangi)
    }
    @Provides
    fun ichi(gaz: Gaz,maytafon: Maytafon,rul: Rul,tormoz: Tormoz):Ichi{
        return Ichi(gaz, maytafon, rul, tormoz)
    }

    @Provides
    fun tashqarisi(balon: Balon,akumlator: Akumlator,mator: Mator,baqavoyOyna: BaqavoyOyna):Tashqarisi{
        return Tashqarisi(balon, akumlator, mator, baqavoyOyna)
    }









    @Provides
    fun rangi():Rangi{
        return Rangi()
    }

    @Provides
    fun gaz():Gaz{
        return Gaz()
    }
    @Provides
    fun maytafon():Maytafon{
        return Maytafon()
    }
    @Provides
    fun rul():Rul{
        return Rul()
    }
    @Provides
    fun tormoz():Tormoz{
        return Tormoz()
    }




    @Provides
    fun akumlator():Akumlator{
        return Akumlator()
    }
    @Provides
    fun balon():Balon{
        return Balon()
    }
    @Provides
    fun bOyna():BaqavoyOyna{
        return BaqavoyOyna()
    }
    @Provides
    fun mator():Mator{
        return Mator()
    }



}