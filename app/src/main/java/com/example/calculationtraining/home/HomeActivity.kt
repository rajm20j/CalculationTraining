package com.example.calculationtraining.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.calculationtraining.MyApp
import com.example.calculationtraining.R
import javax.inject.Inject

class HomeActivity : AppCompatActivity() {
    private lateinit var homeViewModel: HomeViewModel
    @Inject
    lateinit var homeVMFactory: HomeVMFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        (application as MyApp).myComponent.doInjection(this)

        homeViewModel = ViewModelProvider(this, homeVMFactory).get(HomeViewModel::class.java)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.home_coordinator, HomeFragment())
            commit()
        }
    }
}