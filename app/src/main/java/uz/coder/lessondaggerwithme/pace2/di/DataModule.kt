package uz.coder.lessondaggerwithme.pace2.di

import dagger.Binds
import dagger.Module
import uz.coder.lessondaggerwithme.pace2.data.datasource.ExampleLocalDataSource
import uz.coder.lessondaggerwithme.pace2.data.datasource.ExampleLocalDataSourceImpl
import uz.coder.lessondaggerwithme.pace2.data.datasource.ExampleRemoteDataSource
import uz.coder.lessondaggerwithme.pace2.data.datasource.ExampleRemoteDataSourceImpl


@Module
interface DataModule {
    @Binds
    fun bindExampleLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource
    @Binds
    fun bindExampleRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource




}