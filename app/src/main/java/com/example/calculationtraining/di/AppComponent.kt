package com.example.calculationtraining.di

import com.example.calculationtraining.data.Repository
import com.example.calculationtraining.home.HomeActivity
import dagger.Component
import javax.inject.Singleton


@Component(modules = [AppModule::class, UtilsModule::class])
@Singleton
interface AppComponent {
    fun doInjection(repository: Repository)

    fun doInjection(homeActivity: HomeActivity)
}