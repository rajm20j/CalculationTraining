package com.example.calculationtraining

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import androidx.appcompat.app.AppCompatDelegate
import com.example.calculationtraining.di.UtilsModule
import com.example.calculationtraining.di.AppComponent
import com.example.calculationtraining.di.AppModule
import com.example.calculationtraining.di.DaggerAppComponent

class MyApp : Application() {
    lateinit var myComponent: AppComponent

    companion object {
        @SuppressLint("StaticFieldLeak")
        var context: Context? = null
            private set
    }

    override fun onCreate() {
        super.onCreate()
        myComponent = createMyComponent()
        context = this.applicationContext
    }

    private fun createMyComponent(): AppComponent{
        return DaggerAppComponent
            .builder()
            .appModule(AppModule(this.applicationContext))
            .utilsModule(UtilsModule())
            .build()
    }
}