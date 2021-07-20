package io.github.qlusiv1.database.models.fanRelated.fanRelatedDaos

import androidx.room.*
import io.github.qlusiv1.database.models.fanRelated.FanWorkOfArt
import kotlinx.coroutines.flow.Flow

@Dao
interface FanWorkOfArtDao {
    @Insert
    suspend fun insertFanWorksOfArt(vararg fanWorkOfArt: FanWorkOfArt)

    @Query("select * from FanWorkOfArt")
    fun getAllFanWorksOfArt(): Flow<List<FanWorkOfArt>>

    @Update
    suspend fun updateFanWorksOfArt( vararg fanWorkOfArt: FanWorkOfArt)

    @Delete
    suspend fun deleteFanWorkOfArt(fanWorkOfArt: FanWorkOfArt)
}