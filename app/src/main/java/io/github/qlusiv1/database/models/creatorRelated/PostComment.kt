package io.github.qlusiv1.database.models.creatorRelated

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PostComment(
    @PrimaryKey val id: Long,
    val postId: Long,
    val creatorId: Long,
    val fanId: Long,
    val studioId: Long,
    val message: String
)