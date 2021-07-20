package io.github.qlusiv1.database.models.fanRelated.fanRelatedDaos

import androidx.room.*
import io.github.qlusiv1.database.models.fanRelated.FanAccount
import kotlinx.coroutines.flow.Flow

@Dao
interface FanAccountDao {

    @Insert
    suspend fun insertFanAccounts(vararg fanAccount: FanAccount)

    @Query("select * from FanAccount")
    fun getAllFanAccounts(): Flow<List<FanAccount>>

    @Update
    suspend fun updateFanAccounts(vararg fanAccounts : FanAccount)

    @Delete
    suspend fun deleteFanAccount(fanAccount: FanAccount)
}