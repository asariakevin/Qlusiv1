package io.github.qlusiv1.screens.explore

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import io.github.qlusiv1.screens.explore.catalogues.CataloguesExploreFragment
import io.github.qlusiv1.screens.explore.creators.CreatorsFragment
import io.github.qlusiv1.screens.explore.trending.TrendingFragment

class ExploreTabLayoutHolderFragmentStateAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> CreatorsFragment()
            1 -> CataloguesExploreFragment()
            2 -> TrendingFragment()
            else -> CreatorsFragment()
        }
    }
}