package com.example.lab5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
//import com.bumptech.glide.Glide
import com.example.lab5.databinding.FragmentListBinding
import com.example.lab5.view.CatListView
import kotlinx.android.synthetic.main.fragment_list.*

class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(inflater, container, false)

        /*TODO Attach your "viewModel" in xml to the "CatListView"*/

        /*TODO Setup data binding observers for name, cuteCount, notCuteCount and isListCompleted (see the slides for details on how to do it)*/

        binding.catlive = ViewModelProviders.of(this).get(CatListView::class.java).also { view ->
            view.name.observe(this, Observer { newName -> cat_name.text = newName })
            view.notCuteCount.observe(
                this,
                Observer { notCuteCount -> not_cute_score.text = notCuteCount.toString() })
            view.cuteCount.observe(
                this,
                Observer { cuteCount -> cute_score.text = cuteCount.toString() })
            view.isListCompleted.observe(this, Observer { complete ->
                if (complete) {
                    findNavController().navigate(R.id.finalFragment)
                }
            })
        }

        binding.lifecycleOwner = this

        return binding.root
    }


}