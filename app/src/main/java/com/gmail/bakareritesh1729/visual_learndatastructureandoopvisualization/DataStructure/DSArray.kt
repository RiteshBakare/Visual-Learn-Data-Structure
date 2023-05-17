package com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.DataStructure

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.databinding.FragmentDSArrayBinding

class DSArray : Fragment() {

    private lateinit var binding: FragmentDSArrayBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDSArrayBinding.inflate(layoutInflater,container,false)

        binding.btnPlay.setOnClickListener {
            playAnimation()
        }

        return binding.root
    }

    private fun playAnimation() {

        binding.ElementA.animate().apply {
            binding.ElementA.visibility = View.VISIBLE
            duration = 1000
            translationY(-120f)
        }.withEndAction {

            binding.ElementB.visibility = View.VISIBLE
            binding.ElementB.animate().apply {
                duration = 1000
                translationY(-120f)

                binding.pointer.animate().apply {
                    duration = 1000
                    translationX(160f)
                }.withEndAction {

                    binding.ElementC.visibility = View.VISIBLE
                    binding.ElementC.animate().apply {
                        duration = 1000
                        translationY(-120f)
                        binding.pointer.animate().apply {
                            duration = 1000
                            translationX(350f)
                        }.withEndAction {

                            binding.ElementD.visibility = View.VISIBLE
                            binding.ElementD.animate().apply {
                                duration = 1000
                                translationY(-120f)
                                binding.pointer.animate().apply {
                                    duration = 1000
                                    translationX(570f)
                                }.withEndAction {

                                    binding.ElementE.visibility = View.VISIBLE
                                    binding.ElementE.animate().apply {
                                        duration = 1000
                                        translationY(-120f)
                                        binding.pointer.animate().apply {
                                            duration = 1000
                                            translationX(700f)
                                        }.withEndAction {

                                            binding.ElementF.visibility = View.VISIBLE
                                            binding.ElementF.animate().apply {
                                                duration = 1000
                                                translationY(-120f)
                                                binding.pointer.animate().apply {
                                                    duration = 1000
                                                    translationX(900f)
                                                }

                                            }
                                        }

                                    }

                                }

                            }

                        }
                    }
                }
            }

        }
    }

}