package com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.DataStructure

import android.annotation.SuppressLint
import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.fragment.findNavController
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.R
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.databinding.FragmentDSLinkListBinding
import com.google.android.material.button.MaterialButton


class DSLinkList : Fragment() {


    var counter = -1

    lateinit var node_a: ImageView
    lateinit var node_b: ImageView
    lateinit var node_c: ImageView
    lateinit var node_d: ImageView
    lateinit var node_e: ImageView

    lateinit var link_a_b: ImageView
    lateinit var link_b_c: ImageView
    lateinit var link_c_d: ImageView
    lateinit var link_d_e: ImageView
    lateinit var link_e_f: ImageView

    lateinit var addNodeBtn: MaterialButton
    lateinit var delNodeBtn: MaterialButton

    lateinit var layout: ConstraintLayout

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = layoutInflater.inflate(R.layout.fragment_d_s_link_list,container,false)

        layout = view.findViewById<ConstraintLayout>(R.id.constraintLayout)
        layout.setBackgroundResource(R.color.white)

        node_a = view.findViewById<ImageView>(R.id.node_a)
        node_b = view.findViewById<ImageView>(R.id.node_b)
        node_c = view.findViewById<ImageView>(R.id.node_c)
        node_d = view.findViewById<ImageView>(R.id.node_d)
        node_e = view.findViewById<ImageView>(R.id.node_e)

        link_a_b = view.findViewById<ImageView>(R.id.link_a_b)
        link_b_c = view.findViewById<ImageView>(R.id.link_b_c)
        link_c_d = view.findViewById<ImageView>(R.id.link_c_d)
        link_d_e = view.findViewById<ImageView>(R.id.link_d_e)
        link_e_f = view.findViewById<ImageView>(R.id.link_e_f)

        addNodeBtn = view.findViewById<MaterialButton>(R.id.addNode)
        delNodeBtn = view.findViewById<MaterialButton>(R.id.delNode)

//        val btnNew = view.findViewById<Button>(R.id.btnNew)
//        btnNew.setOnClickListener {
//            findNavController().navigate(R.id.action_DSLinkList_to_DSLinkListUpdate)
//        }

        addNodeBtn.setOnClickListener {
            addNode()

            if (counter != 4){
                counter++
            }
        }

        delNodeBtn.setOnClickListener {
            delNode()

            if (counter != -1){
                counter--
            }
        }

        return view
    }

    fun addNode(){

        if (counter == -1){

            node_a.animate().apply {
                duration = 1000
                translationY(-120f)
                alpha(1f)

                link_a_b.animate().apply {
                    duration = 1000
                    translationY(-120f)
                }
            }
        }

        if (counter == 0){

            node_b.animate().apply {
                duration = 1000
                translationY(-240f)
                alpha(1f)

                link_b_c.animate().apply {
                    duration = 1000
                    translationY(-240f)
                    alpha(1f)
                }

                link_a_b.animate().apply {
                    alpha(1f)
                }
            }
        }

        if (counter == 1){

            node_c.animate().apply {
                duration = 1000
                translationY(-360f)
                alpha(1f)

                link_c_d.animate().apply {
                    duration = 1000
                    translationY(-360f)
                }

                link_b_c.animate().apply {
                    alpha(1f)
                }
            }
        }

        if (counter == 2){

            node_d.animate().apply {
                duration = 1000
                translationY(-480f)
                alpha(1f)

                link_d_e.animate().apply {
                    duration = 1000
                    translationY(-480f)
                }

                link_c_d.animate().apply {
                    alpha(1f)
                }
            }
        }

        if (counter == 3){

            node_e.animate().apply {
                duration = 1000
                translationY(-600f)
                alpha(1f)

                link_e_f.animate().apply {
                    duration = 1000
                    translationY(-600f)
                }

                link_d_e.animate().apply {
                    alpha(1f)
                }
            }
        }

        if (counter == 4){
            counter = 4
            Toast.makeText(context?.applicationContext, "That is enough", Toast.LENGTH_SHORT).show()
        }


    }

    fun delNode(){

        if (counter == 0){

            node_a.animate().apply {
                duration = 1000
                translationY(+120f)
                alpha(0f)

                link_a_b.animate().apply {
                    duration = 1000
                    translationY(+120f)
                }
            }
        }

        if (counter == 1){

            node_b.animate().apply {
                duration = 1000
                translationY(+240f)
                alpha(0f)

                link_b_c.animate().apply {
                    duration = 1000
                    translationY(+240f)
                    alpha(0f)
                }

                link_a_b.animate().apply {
                    alpha(0f)
                }
            }
        }

        if (counter == 2){

            node_c.animate().apply {
                duration = 1000
                translationY(+360f)
                alpha(0f)

                link_c_d.animate().apply {
                    duration = 1000
                    translationY(+360f)
                }

                link_b_c.animate().apply {
                    alpha(0f)
                }
            }
        }

        if (counter == 3){

            node_d.animate().apply {
                duration = 1000
                translationY(+480f)
                alpha(0f)

                link_d_e.animate().apply {
                    duration = 1000
                    translationY(+480f)
                }

                link_c_d.animate().apply {
                    alpha(0f)
                }
            }
        }

        if (counter == 4){

            node_e.animate().apply {
                duration = 1000
                translationY(+600f)
                alpha(0f)

                link_e_f.animate().apply {
                    duration = 1000
                    translationY(+600f)
                }

                link_d_e.animate().apply {
                    alpha(0f)
                }
            }
        }

        if (counter == -1){
            Toast.makeText(context?.applicationContext, "That is enough", Toast.LENGTH_SHORT).show()
        }


    }

}