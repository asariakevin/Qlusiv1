package io.github.qlusiv1.network.dataTransferObjects.models

import com.squareup.moshi.Json

data class Project(
    val id: Long,
    val title: String?,
    val support: Long?,
    val supports: Long?,
    val likes: Long?,
    val plays: Long?,
    @Json(name = "video_url")val videoUrl: String?,
    @Json(name = "created_at")val createdAt: String?,
    @Json(name = "updated_at")val updatedAt: String?,
    @Json(name = "artist_id")val artistId: Long
)
