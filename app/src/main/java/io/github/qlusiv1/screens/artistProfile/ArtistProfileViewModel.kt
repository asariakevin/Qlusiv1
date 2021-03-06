package io.github.qlusiv1.screens.artistProfile

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.github.qlusiv1.network.SubscriptionsApi
import kotlinx.coroutines.launch

class ArtistProfileViewModel : ViewModel() {

    var imageUrl  = MutableLiveData<String>()
    var artistId: Long = 0
    var fanId: Long = 1

    fun getArtistProfile(id: Long){

        artistId = id
        viewModelScope.launch {
            var creatorProfile = SubscriptionsApi.retrofitService.getCreatorProfile(id)

            try {

                var creatorProfile = creatorProfile.await()
                imageUrl.value =  creatorProfile.imageUrl
                Log.d("Viewmodel", "Creator Image Url updated")
                Log.d("Viewmodel", imageUrl.value.toString())


            }catch (e: Exception){

                Log.d("Viewmodel", "something went wrong")
                Log.d("Viewmodel", e.message!!)
            }
        }
    }


    fun subscribeToArtist(){

       var creatorProfile =  SubscriptionsApi.retrofitService.subscribeToArtist(artistId,fanId)
    }
}