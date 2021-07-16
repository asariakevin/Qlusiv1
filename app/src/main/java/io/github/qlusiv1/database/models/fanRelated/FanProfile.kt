package io.github.qlusiv1.database.models.fanRelated

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class FanProfile(

    @PrimaryKey val id: Long,
    val fanId: Long,
    val imageUrl: String,
    val localImageUrl: String,
    val name: String

)