package io.github.qlusiv1.database.models.associations

import androidx.room.Embedded
import androidx.room.Relation
import io.github.qlusiv1.database.models.fanRelated.Fan
import io.github.qlusiv1.database.models.fanRelated.FanProfile

data class FanAndFanProfile(
    @Embedded val fan: Fan,
    @Relation(
        parentColumn = "id",
        entityColumn = "fanId"
    )

    val fanProfile: FanProfile
)
