package uz.example.daggerlesson.package2.presentation

import uz.coder.lessondaggerwithme.pace2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(private val exampleUseCase: ExampleUseCase) {
    fun method(){
        exampleUseCase()
    }
}