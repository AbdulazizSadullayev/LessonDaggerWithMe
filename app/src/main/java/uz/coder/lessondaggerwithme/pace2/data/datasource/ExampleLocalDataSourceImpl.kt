package uz.coder.lessondaggerwithme.pace2.data.datasource

import uz.coder.lessondaggerwithme.pace2.data.database.ExampleDatabase
import uz.coder.lessondaggerwithme.pace2.data.datasource.ExampleLocalDataSource
import javax.inject.Inject

class ExampleLocalDataSourceImpl
@Inject constructor(
    val database: ExampleDatabase,
) : ExampleLocalDataSource {
    override fun method() {
        database.method()
    }
}