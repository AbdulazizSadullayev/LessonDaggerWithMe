package uz.coder.lessondaggerwithme.pace2.di

import dagger.Binds
import dagger.Module
import uz.coder.lessondaggerwithme.pace2.data.repository.ExampleRepositoryImpl
import uz.coder.lessondaggerwithme.pace2.domain.ExampleRepository

@Module
 interface DomainModule {

    @Binds
    fun bindExampleRepository(impl: ExampleRepositoryImpl): ExampleRepository


}