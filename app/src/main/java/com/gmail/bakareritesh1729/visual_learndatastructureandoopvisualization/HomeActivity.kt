package com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.BottomNavigation.CodeFragment
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.BottomNavigation.HomeFragment
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.BottomNavigation.NotesFragment
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.databinding.ActivityHomeBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(HomeFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {

            when (it.itemId) {
                R.id.navHome -> {
                    replaceFragment(HomeFragment())
                }
                R.id.navCode -> {
                    replaceFragment(CodeFragment())
                }
//                R.id.navNotes -> {
//                    replaceFragment(NotesFragment())
//                }
                else -> {
                    Log.e("Fragments","Error")
                }
            }

            true
        }


    }


    private fun replaceFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.FrameLayout, fragment)
        fragmentTransaction.commit()
    }

}