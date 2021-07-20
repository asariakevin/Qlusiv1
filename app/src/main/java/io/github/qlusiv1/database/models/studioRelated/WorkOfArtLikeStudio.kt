package io.github.qlusiv1.database.models.studioRelated

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class WorkOfArtLikeStudio(
    @PrimaryKey val id: Long,
    val workOfArtStudioId: Long,
    val fanId: Long,
    val studioId: Long,
    val creatorId: Long
)


