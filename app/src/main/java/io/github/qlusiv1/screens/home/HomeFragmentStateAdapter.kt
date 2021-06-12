package io.github.qlusiv1.screens.home

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import io.github.qlusiv1.screens.myCollection.MyCollection
import io.github.qlusiv1.screens.subscriptions.SubscriptionsFragment

class HomeFragmentStateAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> SubscriptionsFragment()
            1 -> MyCollection()
            else -> SubscriptionsFragment()
        }
    }

    override fun getItemCount(): Int  = 3
}