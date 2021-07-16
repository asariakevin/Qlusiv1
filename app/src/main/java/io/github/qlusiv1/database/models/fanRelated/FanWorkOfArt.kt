package io.github.qlusiv1.database.models.fanRelated

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class FanWorkOfArt(
    @PrimaryKey val id : Long,
    val fanId: Long,
    val support: Integer,
    val numberOfSupports : Integer,
    val plays: Integer,
    val likes: Integer,
    val videoUrl: String,
    val localVideoUri: String,
    val downloaded: Boolean
)