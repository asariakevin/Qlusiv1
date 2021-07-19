package io.github.qlusiv1.database.models.creatorRelated

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CreatorPost(
    @PrimaryKey val id: Long,
    val creatorId: Long,
    val caption: String,
    val imageUrl: String,
    val videoUrl: String,
    val likes: Integer
)