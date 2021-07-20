package io.github.qlusiv1.database.models.studioRelated

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PostLikeStudio(
    @PrimaryKey val id: Long,
    val postStudioId: Long,
    val fanId: Long,
    val studioId: Long,
    val creatorId: Long
)
