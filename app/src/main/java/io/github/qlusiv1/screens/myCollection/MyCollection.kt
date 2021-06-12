package io.github.qlusiv1.screens.myCollection

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

class MyCollection : Fragment() {



    private lateinit var viewModel: MyCollectionViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {




        viewModel = ViewModelProvider(this).get(MyCollectionViewModel::class.java)

        val view = inflater.inflate(R.layout.my_collection_fragment, container, false)
        val adapter = MyCollectionAdapter()
        val recycler = view.findViewById(R.id.my_collection_recyclerview) as RecyclerView
        recycler.adapter = adapter
        recycler.layoutManager = GridLayoutManager(context, 2)

        viewModel.collectionList.observe(viewLifecycleOwner, Observer { sublist ->  adapter.data = sublist })
        return view
    }



}