package io.github.qlusiv1.network

import com.squareup.moshi.Json

data class Subscription(
    val id : Int,
    val name: String,
    @Json(name = "created_at") val createdAt: String,
    @Json(name="updated_at") val updatedAt: String

    )