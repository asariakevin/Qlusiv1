package io.github.qlusiv1.database.models.fanRelated

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class FanAccount(
    @PrimaryKey val id: Long,
    val fanId: Long,
    val balance: Integer,
    val phoneNumber: String
)