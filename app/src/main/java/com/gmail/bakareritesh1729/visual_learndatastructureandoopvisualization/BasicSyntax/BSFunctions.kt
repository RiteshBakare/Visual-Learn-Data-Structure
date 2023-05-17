package com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.BasicSyntax

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.R
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.databinding.FragmentBSFunctionsBinding


class BSFunctions : Fragment() {

    lateinit var functionPointer: ImageView
    lateinit var mainFunction: ImageView
    lateinit var addFunction: ImageView

    lateinit var play: CardView

    lateinit var textResult: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_b_s_functions, container, false)


        functionPointer = view.findViewById(R.id.funPointer)
        mainFunction = view.findViewById(R.id.funMain)
        addFunction = view.findViewById(R.id.funAdd)
        play = view.findViewById(R.id.btn_play)
        textResult = view.findViewById(R.id.tv_result)

        play.setOnClickListener {
            animateFunction()
        }



        return view
    }

    private fun animateFunction() {

        functionPointer.animate().apply {
            duration = 2000
            translationY(300f)
        }.withEndAction {
            functionPointer.animate().apply {
                duration = 2000
                translationY(-380f)
                textResult.text = "Executing add() function"
            }.withEndAction {
                Toast.makeText(context?.applicationContext, "Add() executed", Toast.LENGTH_LONG)
                    .show()
                functionPointer.animate().apply {
                    translationY(400f)
                    addFunction.visibility = View.INVISIBLE
                    textResult.text = "Executing main() function"
                }
            }
        }


    }

}