package io.github.qlusiv1.database.models.fanRelated.fanRelatedDaos

import androidx.room.*
import io.github.qlusiv1.database.models.fanRelated.Fan
import kotlinx.coroutines.flow.Flow


@Dao
interface FanDao {
    //crud
/*
    @Insert
    fun insertAll(vararg users: User)

    @Delete
    fun delete(user: User)

    @Query("SELECT * FROM user")
    fun getAll(): List<User>

     @Update
    fun updateUsers(vararg users: User)


 */

    @Insert
    suspend fun insertFans(vararg fans: Fan)

    @Query("select * from Fan")
    fun getAllFans(): Flow<List<Fan>>

    @Update
    suspend fun updateFans(vararg fans: Fan)

    @Delete
    suspend fun deleteFan(fan: Fan)




}