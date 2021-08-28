package io.github.qlusiv1.screens.artistHome

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import io.github.qlusiv1.screens.explore.catalogues.CataloguesExploreFragment
import io.github.qlusiv1.screens.messages.Messages
import io.github.qlusiv1.screens.posts.ArtistPosts

class ArtistHomeFragmentStateAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> ArtistPosts()
            1 -> CataloguesExploreFragment()
            2 -> Messages()
            else -> ArtistPosts()
        }
    }
}