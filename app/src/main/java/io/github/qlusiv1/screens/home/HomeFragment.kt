package io.github.qlusiv1.screens.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import io.github.qlusiv1.R


class HomeFragment : Fragment() {


    private lateinit  var viewPager: ViewPager2
    private lateinit  var homeFragmentStateAdapter: HomeFragmentStateAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        homeFragmentStateAdapter = HomeFragmentStateAdapter(this)
        viewPager = view.findViewById(R.id.pager) as ViewPager2
        viewPager.adapter = homeFragmentStateAdapter

        val tabLayout = view.findViewById(R.id.tab_layout) as TabLayout
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->

            when(position){
                0 -> tab.text = "Subscriptions"
                1 -> tab.text = "My Collection"
                2 -> tab.text = "Downloads"
            }
        }.attach()



    }


}