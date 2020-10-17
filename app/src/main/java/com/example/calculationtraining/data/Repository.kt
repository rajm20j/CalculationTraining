package com.example.calculationtraining.data

import android.content.BroadcastReceiver
import android.content.Context
import android.util.Log
import com.example.calculationtraining.MyApp
import com.example.calculationtraining.extra.SharedPrefHelper
import javax.inject.Inject

class Repository {
    @Inject
    lateinit var context: Context

    @Inject
    lateinit var sharedPrefHelper: SharedPrefHelper

    init {
        (MyApp.context as MyApp).myComponent.doInjection(this)
    }
}