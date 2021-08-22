package io.github.qlusiv1.screens.posts

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.github.qlusiv1.Selections
import io.github.qlusiv1.network.SubscriptionsApi
import io.github.qlusiv1.network.dataTransferObjects.models.Post
import kotlinx.coroutines.launch

class ArtistPostsViewModel : ViewModel() {

    val posts = MutableLiveData<List<Post>>()

    init {
    }

    fun getPost(){
        viewModelScope.launch{

            var creatorPosts = SubscriptionsApi.retrofitService.getCreatorPosts(Selections.selectedArtistId)

            try {
                posts.value = creatorPosts.await()
                Log.d("ArtistPostsViemModel", posts.value.toString())
            }catch (e: Exception){
                Log.d("ArtistPostsViewModel", e.toString())
            }

        }
    }
}