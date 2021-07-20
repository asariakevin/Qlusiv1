package io.github.qlusiv1.database.models.studioRelated

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PostStudio(
    @PrimaryKey val id: Long,
    val studioId: Long,
    val caption: String,
    val imageUrl: String,
    val videoUrl: String,
    val likes: Integer
)

