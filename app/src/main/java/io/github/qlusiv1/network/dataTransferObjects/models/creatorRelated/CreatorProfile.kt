package io.github.qlusiv1.network.dataTransferObjects.models.creatorRelated

import com.squareup.moshi.Json


data class CreatorProfile(
//    val id: Long,
    @Json(name = "creator_id")val creatorId : Long,
    @Json(name = "image_url")val imageUrl : String,
    val name: String,
 //   val bio: String,
  //  val city: String,
    @Json(name = "number_of_followers")val numberOfFollowers: Long,
    @Json(name = "number_of_plays") val numberOfPlays: Long
   // val tag: String

)