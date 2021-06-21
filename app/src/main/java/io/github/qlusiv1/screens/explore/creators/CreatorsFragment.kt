package io.github.qlusiv1.screens.explore.creators

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.qlusiv1.R

class CreatorsFragment : Fragment() {

    companion object {
        fun newInstance() = CreatorsFragment()
    }

    private lateinit var viewModel: CreatorsViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.creators_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CreatorsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}