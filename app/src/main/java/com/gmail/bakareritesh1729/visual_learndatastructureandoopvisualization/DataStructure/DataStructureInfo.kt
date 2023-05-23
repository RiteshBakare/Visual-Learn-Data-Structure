package com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.DataStructure

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.R
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.databinding.FragmentDataStructureInfoBinding


class DataStructureInfo : Fragment() {

    private lateinit var binding: FragmentDataStructureInfoBinding

    private val args: DataStructureInfoArgs by navArgs()

    private var topic: String = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentDataStructureInfoBinding.inflate(layoutInflater, container, false)

        binding.btnVisual.setOnClickListener {
            navigateToNextScreen()
        }


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        topic = args.dsTopic

        binding.tvTitle.text = topic
        getContain()
    }

    private fun navigateToNextScreen() {

        if (DataStructureList.Array == topic) {
            findNavController().navigate(R.id.action_dataStructureInfo_to_DSArray)
        } else if (DataStructureList.LinkList == topic) {
            findNavController().navigate(R.id.action_dataStructureInfo_to_DSLinkList)
        } else if (DataStructureList.Stack == topic) {
            findNavController().navigate(R.id.action_dataStructureInfo_to_DSStack)
        } else if (DataStructureList.Queue == topic) {
            findNavController().navigate(R.id.action_dataStructureInfo_to_DSQueue)
        } else if (DataStructureList.Tree == topic) {
            findNavController().navigate(R.id.action_dataStructureInfo_to_DSTrees)
        } else if (DataStructureList.Graph == topic) {
            findNavController().navigate(R.id.action_dataStructureInfo_to_DSGraph)
        }

    }

    private fun getContain() {

        if (DataStructureList.Array == topic) {
            binding.tvContain.setText(R.string.array_info)
        } else if (DataStructureList.LinkList == topic) {
            binding.tvContain.setText(R.string.link_list_info)
        } else if (DataStructureList.Stack == topic) {
            binding.tvContain.setText(R.string.stack_info)
        } else if (DataStructureList.Queue == topic) {
            binding.tvContain.setText(R.string.queue_info)
        } else if (DataStructureList.Tree == topic) {
            binding.tvContain.setText(R.string.tree_info)
        } else if (DataStructureList.Graph == topic) {
            binding.tvContain.setText(R.string.graph_info)
        }

    }

}