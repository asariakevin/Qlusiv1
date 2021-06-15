package io.github.qlusiv1.screens.subscriptions

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import io.github.qlusiv1.R

class SubscriptionsFragment : Fragment() {

    companion object {
        fun newInstance() = SubscriptionsFragment()
    }

    private lateinit var viewModel: SubscriptionsViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        viewModel = ViewModelProvider(this).get(SubscriptionsViewModel::class.java)

        val view = inflater.inflate(R.layout.subscriptions_fragment, container, false)
        val adapter = SubscriptionsAdapter()
        val recycler = view.findViewById(R.id.subscriptions_recyclerview) as RecyclerView
        recycler.adapter = adapter

        viewModel.subscriptionsList.observe(viewLifecycleOwner, Observer { sublist ->  adapter.data = sublist })
        return view
    }



}