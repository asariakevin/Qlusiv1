package io.github.qlusiv1.database.models.creatorRelated

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CreatorWorkOfArtLike(
    @PrimaryKey val id: Long,
    val creatorWorkOfArtId: Long,
    val fanId: Long,
    val studioId: Long,
    val creatorId: Long
)
