package io.github.qlusiv1.screens.explore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import io.github.qlusiv1.R


class ExploreTabLayoutHolderFragment : Fragment() {


    private lateinit var viewPager2: ViewPager2
    private lateinit  var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_explore_tab_layout_holder, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tabLayout = view.findViewById(R.id.explore_tab_layout_holder) as TabLayout
        viewPager2 = view.findViewById<ViewPager2>(R.id.explore_pager)
        viewPager2.adapter = ExploreTabLayoutHolderFragmentStateAdapter(this)

        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->

            when(position){
                0 -> tab.text = "Creators"
                1 -> tab.text = "Catalogues"
                2 -> tab.text = "Trending"
            }
        }.attach()
    }


}