package io.github.qlusiv1.database.models.joinTables

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Subscription(
    @PrimaryKey val id: Long,
    val fanId : Long,
    val creatorId: Long,
    val creatorImageUri: String,
    val creatorImageUriLocal : String,
    val numberOfPosts: Integer,
    val numberOfWorksOfArt: Integer,
    val numberOfMessages: Integer

)
