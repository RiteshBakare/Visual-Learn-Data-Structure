package com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.BasicSyntax

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.R
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.databinding.FragmentBSConditionalsBinding
import com.google.android.material.button.MaterialButton


class BSConditionals : Fragment() {



    lateinit var layout: ConstraintLayout
    lateinit var visualiseBtn: MaterialButton
    lateinit var arrow: ImageView
    lateinit var condtnCheck: CardView
    lateinit var elseHide: CardView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = layoutInflater.inflate(R.layout.fragment_b_s_conditionals,container,false)


        layout = view.findViewById<ConstraintLayout>(R.id.constraintLayout)
        layout.setBackgroundResource(R.color.white)

        visualiseBtn = view.findViewById<MaterialButton>(R.id.visualBtn)
        arrow = view.findViewById<ImageView>(R.id.arrow_short)
        condtnCheck = view.findViewById<CardView>(R.id.conditionCheck)

        visualiseBtn.setOnClickListener {
            arrow.animate().apply {
                duration = 1000
                translationY(140f)
                alpha(1f)
            }.withEndAction {
                condtnCheck.animate().apply {
                    duration = 1000
                    alpha(1f)
                }.withEndAction{
                    arrow.animate().apply {
                        duration = 2000
                        translationY(300f)
//                        translationX(100f)
                    }.withEndAction {
                        arrow.animate().apply {
                            duration = 2000
                            translationY(1000f)
                            alpha(0f)
                        }.withEndAction {
                            arrow.animate().apply {

                                translationY(-1000f)
//                                translationX(-100f)
                                translationY(-300f)
                                translationY(-140f)

                            }
                            condtnCheck.animate().apply {
                                duration = 500
                                alpha(0f)
                            }
                        }


                    }
                }
            }


        }


        return view
    }


}