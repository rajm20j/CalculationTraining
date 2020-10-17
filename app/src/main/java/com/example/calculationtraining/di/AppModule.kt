package com.example.calculationtraining.di

import android.content.Context
import com.example.calculationtraining.extra.SharedPrefHelper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class AppModule(private val context: Context) {
    @Provides
    @Singleton
    internal fun provideContext(): Context {
        return context
    }

    @Provides
    @Singleton
    internal fun provideSharedPrefHelper(context: Context): SharedPrefHelper {
        return SharedPrefHelper(context)
    }
}