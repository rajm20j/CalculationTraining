package com.example.calculationtraining.di

import androidx.lifecycle.ViewModelProvider
import com.example.calculationtraining.data.Repository
import com.example.calculationtraining.home.HomeVMFactory
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UtilsModule {
    @Provides
    @Singleton
    internal fun getRepository(): Repository {
        return Repository()
    }

    @Provides
    @Singleton
    internal fun getHomeVMFactory(repository: Repository): ViewModelProvider.Factory {
        return HomeVMFactory(repository)
    }
}