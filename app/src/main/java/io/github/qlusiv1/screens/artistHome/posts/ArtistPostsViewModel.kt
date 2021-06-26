package io.github.qlusiv1.screens.posts

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.github.qlusiv1.database.models.Post
import io.github.qlusiv1.database.models.Posts

class ArtistPostsViewModel : ViewModel() {

    val posts = MutableLiveData<List<Post>>()

    init {
        posts.value = Posts.postsList
    }
}