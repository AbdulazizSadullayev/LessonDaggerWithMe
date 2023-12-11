package uz.coder.lessondaggerwithme.pace2.data.database

import android.app.Application
import android.content.Context
import android.util.Log
import uz.coder.lessondaggerwithme.R
import javax.inject.Inject

class ExampleDatabase @Inject constructor(private val application: Application) {
    fun method(){
        Log.d("TEST", "ExampleDatabase: ${application.getString(R.string.app_name)}")
    }
}