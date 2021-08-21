package io.github.qlusiv1.screens.artistProfile

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.lifecycle.Observer
import androidx.navigation.fragment.navArgs
import coil.load
import io.github.qlusiv1.R

class ArtistProfileFragment : Fragment() {

    val args : ArtistProfileFragmentArgs by navArgs()

    companion object {
        fun newInstance() = ArtistProfileFragment()
    }

    private lateinit var viewModel: ArtistProfileViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.artist_profile_fragment, container, false)


        val creatorProfileImage = view.findViewById<ImageView>(R.id.artist_profile_public_image)
        viewModel = ViewModelProvider(this).get(ArtistProfileViewModel::class.java)
        viewModel.getArtistProfile(args.artistId)
        viewModel.imageUrl.observe(viewLifecycleOwner, Observer {
            creatorProfileImage.load(it)
        })

        val subscribeButton = view.findViewById<Button>(R.id.artist_subscribe_button)
        subscribeButton.setOnClickListener{
            viewModel.subscribeToArtist()
        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        // TODO: Use the ViewModel
    }

}