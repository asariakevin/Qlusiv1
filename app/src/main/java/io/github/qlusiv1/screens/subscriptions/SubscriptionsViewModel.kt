package io.github.qlusiv1.screens.subscriptions

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.github.qlusiv1.network.Subscription
import io.github.qlusiv1.network.SubscriptionsApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class SubscriptionsViewModel : ViewModel() {
    var subscriptionsList = MutableLiveData<List<Subscription>>()

    private val viewModelJob = Job()
    private val coroutineScope = CoroutineScope( viewModelJob + Dispatchers.Main )

    init {
        Log.d("Viewmodel", "Initializing")
        getSubscriptions()
    }

    private fun getSubscriptions(){

        coroutineScope.launch {

            var subscriptions = SubscriptionsApi.retrofitService.getSubscriptions()

            try {
                subscriptionsList.value =  subscriptions.await()
                Log.d("Viewmodel", "Subscriptions updated")
                Log.d("Viewmodel", subscriptionsList.value.toString())


            }catch (e: Exception){

                Log.d("Viewmodel", "something went wrong")
                Log.d("Viewmodel", e.message!!)
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }

}