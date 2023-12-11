package uz.coder.lessondaggerwithme.pace2.data.repository

import uz.coder.lessondaggerwithme.pace2.data.database.ExampleDatabase
import uz.coder.lessondaggerwithme.pace2.data.mapper.ExampleMapper
import uz.coder.lessondaggerwithme.pace2.data.network.ExampleApiService
import uz.coder.lessondaggerwithme.pace2.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor (
    private val database: ExampleDatabase,
    private val apiService: ExampleApiService,
    private val mapper: ExampleMapper
): ExampleRepository {
    override fun method() {
        mapper.map()
        database.method()
        apiService.method()
    }
}