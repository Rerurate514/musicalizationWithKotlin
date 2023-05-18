package com.example.musicalization

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.musicalization.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        openHomeFragment()

        Log.d("a23","${FetchFileClass().getFileToList()}")
    }

    private fun openHomeFragment(){
        val tag = "mainFragment"

        var fragment = supportFragmentManager.findFragmentByTag(tag)
        if(fragment != null) return

        fragment = HomeFragment()
        supportFragmentManager.beginTransaction().apply {
            add(R.id.activityFragmentContainer, fragment, tag)
        }.commit()
    }
}