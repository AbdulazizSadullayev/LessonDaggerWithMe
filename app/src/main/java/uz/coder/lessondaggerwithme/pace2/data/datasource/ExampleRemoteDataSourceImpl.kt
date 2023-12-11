package uz.coder.lessondaggerwithme.pace2.data.datasource

import uz.coder.lessondaggerwithme.pace2.data.network.ExampleApiService
import javax.inject.Inject

class ExampleRemoteDataSourceImpl @Inject constructor(
    val apiService: ExampleApiService
):ExampleRemoteDataSource {
    override fun method() {
        apiService.method()
    }
}