package io.github.qlusiv1.database.models.fanRelated.fanRelatedDaos

import androidx.room.*
import io.github.qlusiv1.database.models.fanRelated.FanProfile
import kotlinx.coroutines.flow.Flow

@Dao
interface FanProfileDao {
    @Insert
    suspend fun insertFanProfiles(vararg fanProfile: FanProfile)

    @Query("select * from FanProfile")
    fun getAllFanProfiles() : Flow<List<FanProfile>>

    @Update
    suspend fun updateFanProfile( vararg fanProfile: FanProfile)

    @Delete
    suspend fun deleteFanProfile(fanProfile: FanProfile)
}