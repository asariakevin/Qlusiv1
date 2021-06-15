package io.github.qlusiv1.screens.artistHome

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import io.github.qlusiv1.R

class ArtistHomeFragment : Fragment() {


    private lateinit var viewModel: ArtistHomeViewModel
    private lateinit var viewPager2 : ViewPager2
    private lateinit var artistHomeFragmentStateAdapter: ArtistHomeFragmentStateAdapter
    private lateinit var tabLayout: TabLayout

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.artist_home_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        viewPager2 = view.findViewById(R.id.pager_artist_home_fragment)
        tabLayout = view.findViewById(R.id.tab_layout_artist_home_fragment)
        artistHomeFragmentStateAdapter = ArtistHomeFragmentStateAdapter(this)
        viewPager2.adapter = artistHomeFragmentStateAdapter

        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->

            when(position){
                0 -> tab.text = "Posts"
                1 -> tab.text = "Catalogue"
                2 -> tab.text = "Messages"
            }
        }.attach()
    }


}