package com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.OOP

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.R


class OOPEncapsulation : Fragment() {

    lateinit var simulate : CardView
    lateinit var data : ImageView
    lateinit var methods : ImageView
    lateinit var combine : ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_encapsulation, container, false)

        data = view.findViewById(R.id.iv_data)
        methods = view.findViewById(R.id.iv_methods)
        combine = view.findViewById(R.id.iv_combine)
        simulate = view.findViewById(R.id.btn_simulate)

        simulate.setOnClickListener {
            startSimulation()
        }


        return view
    }

    private fun startSimulation() {

        data.animate().apply {
            duration = 1000
            translationY(-680f)
            translationX(100f)
            rotationBy(-180f)
        }.withEndAction {

            data.visibility = View.GONE
            combine.visibility = View.VISIBLE
        }
        methods.animate().apply {
            duration = 1000
            translationY(-680f)
            translationX(-100f)
            rotationBy(180f)
        }.withEndAction {
            methods.visibility = View.GONE
            combine.visibility = View.VISIBLE
        }
    }


}