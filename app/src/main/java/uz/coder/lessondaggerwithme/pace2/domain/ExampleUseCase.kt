package uz.coder.lessondaggerwithme.pace2.domain

import uz.coder.lessondaggerwithme.pace2.domain.ExampleRepository
import javax.inject.Inject

class ExampleUseCase @Inject constructor(val repository: ExampleRepository) {
    operator fun invoke() = repository.method()
}