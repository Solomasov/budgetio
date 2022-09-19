package com.example.budgetio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewTreeObserver
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = (supportFragmentManager.findFragmentById(R.id.fragmentContainer) as NavHostFragment)
            .navController
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.mainMenu)
        bottomNavigationView.setupWithNavController(navController)

        val buttonAddSpending = findViewById<ImageButton>(R.id.addSpending)
        buttonAddSpending.setOnClickListener {

        }

    }

}