package io.github.qlusiv1.database.models.associations

import androidx.room.Embedded
import androidx.room.Relation
import io.github.qlusiv1.database.models.fanRelated.Fan
import io.github.qlusiv1.network.Subscription

// should we have only this relation since
data class FanAndSubscription(
    @Embedded val fan: Fan,
    @Relation(
        parentColumn = "id",
        entityColumn = "fanId"
    )

    val subscriptions: List<Subscription>

    )
