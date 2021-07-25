package io.github.qlusiv1.database.models

data class Post(
        val title: String
)

object Posts{
    val postsList = List(30){
        Post("Here we go again in the bahamas, how was your day")
    }
}