package com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.DataStructure

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.R
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.databinding.FragmentDSQueueBinding


class DSQueue : Fragment() {

    lateinit var stackA: ImageView
    lateinit var stackB: ImageView
    lateinit var stackC: ImageView
    lateinit var stackD: ImageView
    lateinit var stackE: ImageView

    lateinit var frontImg: ImageView
    lateinit var rearImg: ImageView

    lateinit var enqueue: CardView
    lateinit var dequeue: CardView

    var counter: Int = 1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = layoutInflater.inflate(R.layout.fragment_d_s_queue,container,false)


        stackA = view.findViewById(R.id.stack_a)
        stackB = view.findViewById(R.id.stack_b)
        stackC = view.findViewById(R.id.stack_c)
        stackD = view.findViewById(R.id.stack_d)
        stackE = view.findViewById(R.id.stack_e)

        frontImg = view.findViewById(R.id.front)
        rearImg = view.findViewById(R.id.rear)
        enqueue = view.findViewById(R.id.btn_enqueue)
        dequeue = view.findViewById(R.id.btn_dequeue)

        enqueue.setOnClickListener {
            queuePush()
            counter++
        }

        dequeue.setOnClickListener {
            counter--
            queuePop()
        }




        return view
    }

    private fun queuePop() {

        if(counter > 5) {
            counter=5
        }

        if(counter==5) {
            stackA.animate().apply {
                duration=1000
                translationY(-120f)
            }.withEndAction {
                stackA.visibility = View.GONE
                rearImg.animate().apply {
                    duration=1000
                    translationY(-420f)
                }
            }
        }
        else if (counter==4) {
            stackB.animate().apply {
                duration=1000
                translationY(-120f)
            }.withEndAction {
                stackB.visibility = View.GONE
                rearImg.animate().apply {
                    duration=1000
                    translationY(-650f)
                }
            }
        }
        else if (counter==3) {
            stackC.animate().apply {
                duration=1000
                translationY(-120f)
            }.withEndAction {
                stackC.visibility = View.GONE
                rearImg.animate().apply {
                    duration=1000
                    translationY(-1000f)
                }
            }
        }
        else if (counter==2) {
            stackD.animate().apply {
                duration=1000
                translationY(-120f)
            }.withEndAction {
                stackD.visibility = View.GONE
                rearImg.animate().apply {
                    duration=1000
                    translationY(-1200f)
                }
            }
        }
        else if (counter==1) {
            stackE.animate().apply {
                duration=1000
                translationY(-120f)
            }.withEndAction {
                stackE.visibility = View.GONE
                rearImg.visibility = View.GONE
                frontImg.visibility = View.GONE
            }
        }
        else {
            Toast.makeText(context?.applicationContext,"Queue UnderFlow",Toast.LENGTH_LONG).show()
        }


    }

    private fun queuePush() {

        if(counter < 1) {
            counter=1
        }

        frontImg.visibility = View.VISIBLE
        rearImg.visibility = View.VISIBLE

        if(counter==1) {
            stackA.visibility = View.VISIBLE
            stackA.animate().apply {
                duration=1000
                translationY(-120f)
                frontImg.animate().apply {
                    duration=100
                    translationY(-120f)
                }
                rearImg.animate().apply {
                    duration = 100
                    translationY(-120f)
                }
            }
        }

        else if (counter==2) {
            stackB.visibility = View.VISIBLE
            stackB.animate().apply {
                duration=1000
                translationY(-120f)
                frontImg.animate().apply {
                    duration=100
                    translationY(-420f)
                }
            }
        }
        else if (counter==3) {
            stackC.visibility = View.VISIBLE
            stackC.animate().apply {
                duration=1000
                translationY(-120f)
                frontImg.animate().apply {
                    duration=100
                    translationY(-650f)
                }
            }
        }
        else if (counter==4) {
            stackD.visibility = View.VISIBLE
            stackD.animate().apply {
                duration=1000
                translationY(-120f)
                frontImg.animate().apply {
                    duration=100
                    translationY(-1000f)
                }
            }
        }
        else if (counter==5) {
            stackE.visibility = View.VISIBLE
            stackE.animate().apply {
                duration=1000
                translationY(-120f)
                frontImg.animate().apply {
                    duration=100
                    translationY(-1200f)
                }
            }
        }
        else {
            Toast.makeText(context?.applicationContext,"Queue OverFlow",Toast.LENGTH_LONG).show()
        }
    }


}