package com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.DataStructure

import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.Toast
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.R
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.databinding.FragmentDSTreesBinding

class DSTrees : Fragment() {

    private lateinit var binding: FragmentDSTreesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentDSTreesBinding.inflate(layoutInflater, container, false)

        binding.btnAnimation.setOnClickListener {
            playAnimation()
        }

        return binding.root
    }

    private fun playAnimation() {

        binding.treeA.visibility = View.VISIBLE

        binding.treeA.animate().apply {
            duration=1000
            translationY(100f)
        }.withEndAction {
            binding.treeA.visibility= View.GONE
            binding.treeB.visibility = View.VISIBLE
            binding.treeB.animate().apply {
                translationY(200f)
                duration=1000
            }.withEndAction {
                binding.treeB.visibility = View.INVISIBLE
                binding.treeC.visibility = View.VISIBLE
                binding.treeC.animate().apply {
                    translationY(200f)
                    duration=2000
                }.withEndAction {
                    recreateFragment()
                }
            }
        }
    }

    private fun recreateFragment() {
        // Recreate the fragment
        val fragmentManager = requireFragmentManager()
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.detach(this)
        fragmentTransaction.attach(this)
        fragmentTransaction.commit()
    }

}