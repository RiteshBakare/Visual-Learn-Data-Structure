package com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.BasicSyntax

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.R
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.databinding.FragmentBasicSyntaxInfoBinding


class BasicSyntaxInfo : Fragment() {

    private lateinit var binding: FragmentBasicSyntaxInfoBinding

    private val args: BasicSyntaxInfoArgs by navArgs()

    private var topic: String = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBasicSyntaxInfoBinding.inflate(layoutInflater, container, false)

        binding.tvTitle.text = topic

        binding.btnVisual.setOnClickListener {
            navigateToNextScreen()
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        topic = args.concept.toString()

        binding.tvTitle.text = topic

        if (BasicSyntaxList.dataTypes == topic) {
            binding.tvContain.setText(R.string.data_types)
        }
        else if (BasicSyntaxList.variables == topic) {
            binding.tvContain.setText(R.string.variables)
        }
        else if (BasicSyntaxList.conditionals == topic) {
            binding.tvContain.setText(R.string.conditionals_info)
        }
        else if (BasicSyntaxList.loops == topic) {
            binding.tvContain.setText(R.string.loops_info)
        }
        else if (BasicSyntaxList.function == topic) {
            binding.tvContain.setText(R.string.function_info)
        }
        else if (BasicSyntaxList.switch == topic) {
            binding.tvContain.setText(R.string.switch_info);
        }
    }

    private fun navigateToNextScreen() {
        if (BasicSyntaxList.dataTypes == topic) {
            findNavController().navigate(R.id.action_basic_syntax_info_to_BSDataType)
        } else if (BasicSyntaxList.variables == topic) {
            findNavController().navigate(R.id.action_basic_syntax_info_to_BSVariable)
        } else if (BasicSyntaxList.conditionals == topic) {
            findNavController().navigate(R.id.action_basic_syntax_info_to_BSConditionals)
        } else if (BasicSyntaxList.loops == topic) {
            findNavController().navigate(R.id.action_basic_syntax_info_to_BSLoops)
        } else if (BasicSyntaxList.function == topic) {
            findNavController().navigate(R.id.action_basic_syntax_info_to_BSFunctions)
        } else if (BasicSyntaxList.switch == topic) {
            findNavController().navigate(R.id.action_basic_syntax_info_to_BSSwitch)
        }
    }

}