package com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.BasicSyntax

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.R
import com.google.android.material.button.MaterialButton


class BSVariable : Fragment() {

    private lateinit var btnVisual : MaterialButton
    private lateinit var text : TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_b_s_variable, container, false)

        btnVisual = view.findViewById(R.id.btnVisualVariable)


        btnVisual = view.findViewById(R.id.btnVisualVariable)
        text = view.findViewById(R.id.tvVar)

        btnVisual.setOnClickListener {
            visual()
        }

        return view
    }

    private fun visual() {
        text.animate().apply {
            duration = 1000
            translationX(-240f)
        }.withEndAction {
            text.animate().apply {
                duration=1000
                translationY(800f)
            }
        }
    }


}