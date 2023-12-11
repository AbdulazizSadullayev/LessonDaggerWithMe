package uz.coder.lessondaggerwithme.pace1.mashina.opshi

import dagger.Component
import uz.coder.lessondaggerwithme.pace1.mashina.Rangi

@Component(modules = [CarModule::class])
interface NewComponent {

    fun inject(activity: Activity)



}