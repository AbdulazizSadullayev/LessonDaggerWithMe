package uz.coder.lessondaggerwithme.pace2.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class CoontextModule(private val application: Application) {

    @Provides
    fun provides(): Context{
        return application
    }

}