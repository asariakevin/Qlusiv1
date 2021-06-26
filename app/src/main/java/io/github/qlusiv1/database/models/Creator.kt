package io.github.qlusiv1.database.models

data class Creator(
        val name: String,
        val followers: String,
        val plays: String
)

object Creators{
    val creatorList = List(30){
        Creator("Boom", "40","500")
    }
}