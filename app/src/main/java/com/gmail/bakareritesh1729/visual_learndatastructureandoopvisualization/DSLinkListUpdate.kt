package com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization

import android.annotation.SuppressLint
import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.button.MaterialButton


class DSLinkListUpdate : Fragment() {

    private lateinit var imageOne : ImageView
    private lateinit var imageTwo : ImageView
    private lateinit var imageThree : ImageView

    private lateinit var pointerOne : ImageView
    private lateinit var pointerTwo : ImageView
//    private lateinit var pointerThree : ImageView

    var counter : Int = 0

    private lateinit var tvOne : TextView
    private lateinit var tvTwo : TextView
    private lateinit var tvThree : TextView

    private lateinit var editText : EditText

    private lateinit var button: MaterialButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        val view = inflater.inflate(R.layout.fragment_d_s_link_list_update,container,false)


        imageOne = view.findViewById(R.id.ImageOne)
        imageTwo = view.findViewById(R.id.ImageTwo)
        imageThree = view.findViewById(R.id.ImageThree)
        editText = view.findViewById(R.id.editText)
        pointerOne = view.findViewById(R.id.arrowOne)
        pointerTwo = view.findViewById(R.id.arrowTwo)
        button = view.findViewById(R.id.btnAddNode)

        tvOne = view.findViewById(R.id.tvNodeOne)
        tvTwo = view.findViewById(R.id.tvNodeTwo)
        tvThree = view.findViewById(R.id.tvNodeThree)

        button.setOnClickListener {

            if(editText.text.isEmpty()) {
                Toast.makeText(context?.applicationContext,"Enter Some thing",Toast.LENGTH_SHORT).show()
            }
            else {
                if(counter==0) {
                    //
                    counter++
                }
                else if(counter==1) {
                    addElement(editText.text.toString(),counter)
                    counter++

                }else if (counter == 2) {
                    addElement(editText.text.toString(),counter)
                    counter++
                }
                else if (counter ==3) {
                    addElement(editText.text.toString(),counter)
                    counter++
                }else {
                    counter=0
                }
            }
        }

        return view
    }

    private fun addElement(text: String,counter: Int) {

        if (counter>3) {
            counter == 0
        }

        if(counter==0) {
            imageOne.visibility = View.GONE
            imageTwo.visibility= View.GONE
            imageThree.visibility = View.GONE
            pointerOne.visibility = View.GONE
            pointerTwo.visibility = View.GONE
        }else if (counter == 1) {

            imageOne.visibility = View.VISIBLE
            imageTwo.visibility= View.GONE
            imageThree.visibility = View.GONE
            pointerOne.visibility = View.GONE
            pointerTwo.visibility = View.GONE

            tvOne.text = text

            imageOne.animate().apply {
                duration = 1000

                tvOne.animate().translationX(525f).duration=1000
                translationX(350f)

            }
            Toast.makeText(context?.applicationContext,"Please Enter another Element ",Toast.LENGTH_SHORT).show()
        } else if (counter == 2){
            imageOne.visibility = View.VISIBLE
            imageTwo.visibility= View.VISIBLE
            imageThree.visibility = View.GONE

            pointerTwo.visibility = View.GONE

            tvTwo.text = text

            imageTwo.animate().apply {
                duration = 1000

                tvTwo.animate().translationX(525f).duration=1000
                translationX(350f)

            }.withEndAction{
                pointerOne.animate().apply {
                    duration = 1000
                    pointerOne.visibility = View.VISIBLE
                    translationX(425f)
                }
            }
            Toast.makeText(context?.applicationContext,"Please Enter another Element ",Toast.LENGTH_SHORT).show()

        } else if (counter == 3) {
            imageOne.visibility = View.VISIBLE
            imageTwo.visibility= View.VISIBLE
            imageThree.visibility = View.VISIBLE
            pointerOne.visibility = View.VISIBLE

            tvThree.text = text

            imageThree.animate().apply {
                duration = 1000

                tvThree.animate().translationX(525f).duration=1000
                translationX(350f)

            }.withEndAction {
                pointerTwo.animate().apply {
                    duration = 1000
                    pointerTwo.visibility = View.VISIBLE
                    translationX(425f)
                }

            }
            Toast.makeText(context?.applicationContext,"Please Enter another Element ",Toast.LENGTH_SHORT).show()

        }

    }


}