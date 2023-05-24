package com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.BasicSyntax

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.R
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.databinding.FragmentBSLoopsBinding
import com.google.android.material.button.MaterialButton


class BSLoops : Fragment() {

    private lateinit var binding : FragmentBSLoopsBinding

    lateinit var loop : ImageView
    lateinit var arrow : ImageView
    lateinit var output: TextView
    lateinit var outputWindow: CardView
    lateinit var btnAnimation : MaterialButton
    var outText : String = "Output : - \n"

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = layoutInflater.inflate(R.layout.fragment_b_s_loops,container,false)

        loop = view.findViewById(R.id.loop)
        arrow = view.findViewById(R.id.cycle)
        output = view.findViewById(R.id.looptext)
        outputWindow = view.findViewById(R.id.looptextArea)
        btnAnimation = view.findViewById(R.id.btnAnimationLoop)

        btnAnimation.setOnClickListener {
            animate()
        }


        return view
    }

    private fun animate() {

        loop.visibility = View.VISIBLE
        arrow.visibility = View.VISIBLE
        outputWindow.visibility = View.VISIBLE
        output.visibility = View.VISIBLE
        output.text = outText


        arrow.animate().apply {
            duration = 1000
            rotation(360f)
        }.withEndAction{
            output.animate().apply {
                duration = 1000
                outText += "1\n2\n3\n4\n5\n"
                output.text = outText
            }
        }
    }

}