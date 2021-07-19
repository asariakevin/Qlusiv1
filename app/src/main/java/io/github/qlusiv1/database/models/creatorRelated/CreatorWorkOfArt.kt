package io.github.qlusiv1.database.models.creatorRelated

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CreatorWorkOfArt(
    @PrimaryKey val id: Long,
    val creatorId: Long,
    val title: String,
    val support: Integer,
    val numberOfSupports: Integer,
    val plays: Integer,
    val likes: Integer,
    val videoUrl: String,
    val downloaded: Boolean,
    val videoUriLocal : String
)