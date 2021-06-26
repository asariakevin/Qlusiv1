package io.github.qlusiv1.screens.posts

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
import io.github.qlusiv1.screens.artistHome.posts.ArtistPostsAdapter
import io.github.qlusiv1.screens.myCollection.MyCollectionAdapter
import io.github.qlusiv1.screens.myCollection.MyCollectionViewModel

class ArtistPosts : Fragment() {

    companion object {
        fun newInstance() = ArtistPosts()
    }

    private lateinit var viewModel: ArtistPostsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(ArtistPostsViewModel::class.java)

        val view = inflater.inflate(R.layout.artist_posts_fragment, container, false)
        val adapter = ArtistPostsAdapter()
        val recycler = view.findViewById(R.id.artist_posts_fragment_recyclerview) as RecyclerView
        recycler.adapter = adapter


        viewModel.posts.observe(viewLifecycleOwner, Observer { sublist ->  adapter.data = sublist })
        return view
        //return inflater.inflate(R.layout.artist_posts_fragment, container, false)
    }



}