package io.github.qlusiv1.database.models.creatorRelated

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PostLike(
    @PrimaryKey val id: Long,
    val postId: Long,
    val fanId: Long,
    val studioId: Long,
    val creatorId: Long
)