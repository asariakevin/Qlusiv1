package io.github.qlusiv1.screens.home.account

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.qlusiv1.R

class UserAccountFragment : Fragment() {

    companion object {
        fun newInstance() = UserAccountFragment()
    }

    private lateinit var viewModel: UserAccountViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.user_account_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(UserAccountViewModel::class.java)
        // TODO: Use the ViewModel
    }

}