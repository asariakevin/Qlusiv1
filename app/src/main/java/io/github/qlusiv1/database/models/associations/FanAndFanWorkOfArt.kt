package io.github.qlusiv1.database.models.associations

import androidx.room.Embedded
import androidx.room.Relation
import io.github.qlusiv1.database.models.fanRelated.Fan
import io.github.qlusiv1.database.models.fanRelated.FanWorkOfArt

data class FanAndFanWorkOfArt(
    @Embedded val fan: Fan,
    @Relation(
        parentColumn = "id",
        entityColumn = "fanId"
    )

    val fanWorksOfArt : List<FanWorkOfArt>

    )
