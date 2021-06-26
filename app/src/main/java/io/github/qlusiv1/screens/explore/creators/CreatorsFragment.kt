package io.github.qlusiv1.screens.explore.creators

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.github.qlusiv1.R
import io.github.qlusiv1.screens.myCollection.MyCollectionAdapter
import io.github.qlusiv1.screens.myCollection.MyCollectionViewModel

class CreatorsFragment : Fragment() {

    companion object {
        fun newInstance() = CreatorsFragment()
    }

    private lateinit var viewModel: CreatorsViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {


        viewModel = ViewModelProvider(this).get(CreatorsViewModel::class.java)

        val view = inflater.inflate(R.layout.creators_fragment, container, false)
        val adapter = CreatorsAdapter()
        val recycler = view.findViewById(R.id.creators_fragment_recyclerview) as RecyclerView
        recycler.adapter = adapter
        recycler.layoutManager = GridLayoutManager(context, 2)

        viewModel.creators.observe(viewLifecycleOwner, Observer { sublist ->  adapter.data = sublist })
        return view

    }



}