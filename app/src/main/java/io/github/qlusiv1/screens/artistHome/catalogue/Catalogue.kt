package io.github.qlusiv1.screens.catalogue

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.qlusiv1.R

class Catalogue : Fragment() {

    companion object {
        fun newInstance() = Catalogue()
    }

    private lateinit var viewModel: CatalogueViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.catalogue_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CatalogueViewModel::class.java)
        // TODO: Use the ViewModel
    }

}