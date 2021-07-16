package io.github.qlusiv1.database.models.creatorRelated

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Creator(
    @PrimaryKey val id: Long
)