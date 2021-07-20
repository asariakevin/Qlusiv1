package io.github.qlusiv1.database.models.studioRelated


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ProfileStudio (
    @PrimaryKey val id: Long,
    val studioId : Long,
    val imageUrl : String,
    val name: String,
    val bio: String,
    val city: String

)

