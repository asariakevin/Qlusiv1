package io.github.qlusiv1.database.models.creatorRelated

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CreatorAccount(
    @PrimaryKey val id: Long,
    val creatorId: Long,
    val balance: Integer,
    val phoneNumber: String
)