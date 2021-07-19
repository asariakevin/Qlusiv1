package io.github.qlusiv1.database.models.creatorRelated


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CreatorWorkOfArtComment(
    @PrimaryKey val id: Long,
    val creatorWorkOfArtCommentId: Long,
    val creatorId: Long,
    val fanId: Long,
    val studioId: Long,
    val message: String
)
