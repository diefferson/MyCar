package com.gft.mycar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setupWithNavController(Navigation.findNavController(this, R.id.nav_host_fragment))

        fab.setOnClickListener {
            findNavController(R.id.nav_host_fragment).navigate(R.id.goToCardFragment)
        }
    }
}
