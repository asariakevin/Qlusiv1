package io.github.qlusiv1.database.models.creatorRelated

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CreatorProfile(
    @PrimaryKey val id: Long,
    val creatorId : Long,
    val imageUrl : String,
    val name: String,
    val bio: String,
    val city: String

)