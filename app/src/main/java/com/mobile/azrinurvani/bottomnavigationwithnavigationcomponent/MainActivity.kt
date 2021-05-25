package com.mobile.azrinurvani.bottomnavigationwithnavigationcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavView = findViewById<BottomNavigationView>(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_container)

        //to set Action Bar or AppBar Config (like title fragment)
        val appBarConfiguration = AppBarConfiguration(setOf(R.id.fragmentHome,R.id.fragmentSecond,R.id.fragmentThird))
        setupActionBarWithNavController(navController,appBarConfiguration)
        bottomNavView.setupWithNavController(navController)
    }
}