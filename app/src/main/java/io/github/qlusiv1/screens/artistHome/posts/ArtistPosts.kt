package io.github.qlusiv1.screens.posts

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.qlusiv1.R

class ArtistPosts : Fragment() {

    companion object {
        fun newInstance() = ArtistPosts()
    }

    private lateinit var viewModel: ArtistPostsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.artist_posts_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ArtistPostsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}