package io.github.qlusiv1.network.dataTransferObjects.models

import com.squareup.moshi.Json
import io.github.qlusiv1.database.models.Post

data class Post(
        val id: Long,
        val caption: String,
        val like: Long,
        @Json( name = "image_url")val imageUrl: String,
        @Json(name = "video_url")val videoUrl: String?,
        @Json(name = "artist_id")val artistId: Long,
        @Json(name = "created_at")val createdAt: String,
        @Json(name = "updated_at")val updatedAt: String
)

