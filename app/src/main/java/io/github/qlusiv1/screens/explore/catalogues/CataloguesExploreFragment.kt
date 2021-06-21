package io.github.qlusiv1.screens.explore.catalogues

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.qlusiv1.R

class CataloguesExploreFragment : Fragment() {

    companion object {
        fun newInstance() = CataloguesExploreFragment()
    }

    private lateinit var viewModel: CataloguesExploreViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.catalogues_explore_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CataloguesExploreViewModel::class.java)
        // TODO: Use the ViewModel
    }

}