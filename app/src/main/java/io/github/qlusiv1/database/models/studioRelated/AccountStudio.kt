package io.github.qlusiv1.database.models.studioRelated

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class AccountStudio(
    @PrimaryKey val id: Long,
    val studioId: Long,
    val balance: Integer,
    val phoneNumber: String
)