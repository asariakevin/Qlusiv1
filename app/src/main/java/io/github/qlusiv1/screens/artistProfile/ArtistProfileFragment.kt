package io.github.qlusiv1.screens.artistProfile

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.qlusiv1.R

class ArtistProfileFragment : Fragment() {

    companion object {
        fun newInstance() = ArtistProfileFragment()
    }

    private lateinit var viewModel: ArtistProfileViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.artist_profile_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ArtistProfileViewModel::class.java)
        // TODO: Use the ViewModel
    }

}