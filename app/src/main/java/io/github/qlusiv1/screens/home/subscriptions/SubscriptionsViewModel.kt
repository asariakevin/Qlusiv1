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

    var navigateToArtistHomePage = MutableLiveData<Boolean>()
    var navigateToExploreActivity = MutableLiveData<Boolean>()

    private val viewModelJob = Job()
    private val coroutineScope = CoroutineScope( viewModelJob + Dispatchers.Main )

    init {
        Log.d("Viewmodel", "Initializing")
        //getSubscriptions()
        mockSubscriptionsList()
        navigateToArtistHomePage.value = false
        navigateToExploreActivity.value = false
        Log.d("Viewmodel", "Done Initializing")
    }

    private fun mockSubscriptionsList(){
        subscriptionsList.value = List(20){
            Subscription(1, "Kevin", "Today", "Tomm")
        }
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

    fun navigatedToArtistHome(){
        navigateToArtistHomePage.value = false
    }

    fun navigatedToExploreActivity(){
        navigateToExploreActivity.value = false
    }

}