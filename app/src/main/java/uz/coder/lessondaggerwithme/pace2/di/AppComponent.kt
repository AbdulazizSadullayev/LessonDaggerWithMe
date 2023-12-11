package uz.coder.lessondaggerwithme.pace2.di

import dagger.Component
import uz.coder.lessondaggerwithme.pace2.presentation.MainActivity

@Component(modules = [DataModule::class, DomainModule::class, CoontextModule::class])
interface AppComponent {

fun inject(activity: MainActivity)

}