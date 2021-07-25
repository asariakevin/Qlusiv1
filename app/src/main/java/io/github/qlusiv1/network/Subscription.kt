package io.github.qlusiv1.network

import com.squareup.moshi.Json

data class Subscription(
    val id : Int,
    @Json(name = "fan_id")val fanId : Long,
    @Json(name = "artist_id")val creatorId: Long,
    @Json(name = "artist_name")val creatorName: String,
    @Json(name = "artist_image_uri")val creatorImageUri: String,
    @Json(name = "number_of_posts")val numberOfPosts: Integer,
    @Json(name = "number_of_projects")val numberOfWorksOfArt: Integer,
    @Json(name = "number_of_messages")val numberOfMessages: Integer,
    @Json(name = "created_at") val createdAt: String,
    @Json(name="updated_at") val updatedAt: String

    )