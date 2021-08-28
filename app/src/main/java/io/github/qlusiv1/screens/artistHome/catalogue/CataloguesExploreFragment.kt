package io.github.qlusiv1.screens.artistHome.catalogue

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import io.github.qlusiv1.R

class CataloguesExploreFragment : Fragment() {

    companion object {
        fun newInstance() = CataloguesExploreFragment()
    }

    private lateinit var viewModel: CataloguesExploreViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        viewModel = ViewModelProvider(this).get(CataloguesExploreViewModel::class.java)
        val view =  inflater.inflate(R.layout.catalogues_explore_fragment, container, false)

        val adapter = CatalogueAdapter( CatalogueAdapterClickListener{ fanId, projectId ->
            viewModel.supportProject(fanId, projectId)
        })

        val recyclerView = view.findViewById<RecyclerView>(R.id.catalogue_fragment_recyclerview)
        recyclerView.adapter = adapter


        viewModel.getProjects()
        viewModel.projects.observe(viewLifecycleOwner, Observer {
            adapter.data = it
            println(it)
        })
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // TODO: Use the ViewModel
    }

}