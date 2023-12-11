package uz.coder.lessondaggerwithme.pace2.data.network

import android.content.Context
import android.util.Log
import uz.coder.lessondaggerwithme.R
import javax.inject.Inject

class ExampleApiService @Inject constructor(private val context : Context){
    fun method(){
        Log.d("TEST", "ExampleApiService: ${R.string.app_name} ")
    }
}