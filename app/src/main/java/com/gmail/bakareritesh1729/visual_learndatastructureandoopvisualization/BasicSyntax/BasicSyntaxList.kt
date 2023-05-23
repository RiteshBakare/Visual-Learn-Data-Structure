package com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.BasicSyntax

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.databinding.FragmentBasicSyntaxListBinding


class BasicSyntaxList : Fragment() {

    private lateinit var binding: FragmentBasicSyntaxListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBasicSyntaxListBinding.inflate(layoutInflater, container, false)



        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            tvDataTypes.setOnClickListener {
                val direction = BasicSyntaxListDirections.actionBasicSyntaxListToBasicSyntaxInfo(dataTypes)
                findNavController().navigate(direction)
            }
            tvVariables.setOnClickListener {
                val direction = BasicSyntaxListDirections.actionBasicSyntaxListToBasicSyntaxInfo(variables)
                findNavController().navigate(direction)
            }
            tvConditionals.setOnClickListener {
                val direction = BasicSyntaxListDirections.actionBasicSyntaxListToBasicSyntaxInfo(conditionals)
                findNavController().navigate(direction)
            }
            tvLoops.setOnClickListener {
                val direction = BasicSyntaxListDirections.actionBasicSyntaxListToBasicSyntaxInfo(loops)
                findNavController().navigate(direction)
            }
            tvFunction.setOnClickListener {
                val direction = BasicSyntaxListDirections.actionBasicSyntaxListToBasicSyntaxInfo(function)
                findNavController().navigate(direction)
            }
//            tvSwitch.setOnClickListener {
//                val direction = BasicSyntaxListDirections.actionBasicSyntaxListToBasicSyntaxInfo(switch)
//                findNavController().navigate(direction)
//            }
        }
    }

    companion object {
        const val dataTypes = "DATA_TYPES"
        const val variables = "VARIABLES"
        const val conditionals = "CONDITIONAL"
        const val loops = "LOOPS"
        const val function = "FUNCTION"
        const val switch = "SWITCH"
    }

}