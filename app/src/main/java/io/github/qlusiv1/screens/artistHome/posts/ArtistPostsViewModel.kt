package io.github.qlusiv1.screens.posts

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.github.qlusiv1.network.dataTransferObjects.models.Post
import io.github.qlusiv1.network.dataTransferObjects.models.Posts

class ArtistPostsViewModel : ViewModel() {

    val posts = MutableLiveData<List<Post>>()

    init {
    }
}