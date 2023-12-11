package uz.coder.lessondaggerwithme.pace2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.coder.lessondaggerwithme.R
import uz.coder.lessondaggerwithme.pace2.di.AppComponent
import uz.coder.lessondaggerwithme.pace2.di.CoontextModule
import uz.coder.lessondaggerwithme.pace2.di.DaggerAppComponent


class MainActivity : AppCompatActivity() {
    val comp: AppComponent by lazy {
        DaggerAppComponent.builder().coontextModule(CoontextModule(application)).build()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        comp.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}