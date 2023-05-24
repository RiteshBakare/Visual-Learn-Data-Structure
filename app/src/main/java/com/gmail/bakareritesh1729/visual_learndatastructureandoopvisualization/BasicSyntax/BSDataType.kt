package com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.BasicSyntax

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.R
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.databinding.FragmentBSDataTypeBinding
import com.google.android.material.button.MaterialButton

class BSDataType : Fragment() {

    private lateinit var binding : FragmentBSDataTypeBinding

    lateinit var layout : ConstraintLayout
    lateinit var visualise : MaterialButton

    lateinit var charText : TextView
    lateinit var intText : TextView
    lateinit var floatText : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_b_s_data_type,container,false)


        layout = view.findViewById<ConstraintLayout>(R.id.constraintLayout)
        layout.setBackgroundResource(R.color.white)

        visualise = view.findViewById<MaterialButton>(R.id.visualiseBtn)

        charText = view.findViewById<TextView>(R.id.char_text)
        intText = view.findViewById<TextView>(R.id.int_text)
        floatText = view.findViewById<TextView>(R.id.float_text)


        visualise.setOnClickListener {
            charText.animate().apply {
                duration = 1000
                translationX(-420f)
            }
            intText.animate().apply {
                duration = 1000
                translationX(-420f)
            }
            floatText.animate().apply {
                duration = 1000
                translationX(-480f)
            }
        }

        return view
    }


}