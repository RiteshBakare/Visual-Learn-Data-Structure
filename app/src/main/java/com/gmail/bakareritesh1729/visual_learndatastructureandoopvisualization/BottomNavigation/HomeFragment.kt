package com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.BottomNavigation

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.BasicSyntaxActivity
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.DataStructureActivity
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.OOPActivity
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding : FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomeBinding.inflate(layoutInflater,container,false)

        binding.btnBasicSyntax.setOnClickListener {
            startActivity(Intent(context?.applicationContext,BasicSyntaxActivity::class.java))
            Toast.makeText(context?.applicationContext,"Basic Syntax ",Toast.LENGTH_SHORT).show()
        }

        binding.btnDataStructure.setOnClickListener {
            startActivity(Intent(context?.applicationContext,DataStructureActivity::class.java))
            Toast.makeText(context?.applicationContext,"Data Structure",Toast.LENGTH_SHORT).show()
        }

//        binding.btnOOP.setOnClickListener {
//            startActivity(Intent(context?.applicationContext,OOPActivity::class.java))
//            Toast.makeText(context?.applicationContext,"OOP",Toast.LENGTH_SHORT).show()
//        }

        return binding.root
    }

}