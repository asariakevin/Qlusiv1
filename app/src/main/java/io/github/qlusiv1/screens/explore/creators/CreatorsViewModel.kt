package io.github.qlusiv1.screens.explore.creators

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.github.qlusiv1.database.models.Creator
import io.github.qlusiv1.database.models.Creators
import io.github.qlusiv1.network.SubscriptionsApi
import io.github.qlusiv1.network.dataTransferObjects.models.creatorRelated.CreatorProfile
import kotlinx.coroutines.launch

class CreatorsViewModel : ViewModel() {
    var creators = MutableLiveData<List<CreatorProfile>>()
    var selectedCreatorId : Long = 1
    var navigateToCreatorProfile = MutableLiveData<Boolean>()
    fun navigatedToCreatorProfile() {navigateToCreatorProfile.value = false}

    init {
        getCreatorProfiles()
        navigateToCreatorProfile.value = false
    }


    private fun getCreatorProfiles(){

        viewModelScope.launch {

            var creatorsProfiles = SubscriptionsApi.retrofitService.creatorsExplore()

            try {
                creators.value =  creatorsProfiles.await()
                Log.d("Viewmodel", "CreatorProfiles updated")
                Log.d("Viewmodel", creators.value.toString())


            }catch (e: Exception){

                Log.d("Viewmodel", "something went wrong")
                Log.d("Viewmodel", e.message!!)
            }
        }
    }
}