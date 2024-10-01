package com.saefulrdevs.dicodingevent.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.saefulrdevs.dicodingevent.data.model.FavoriteEvent

@Dao
interface FavoriteEventDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertFavoriteEvent(event: FavoriteEvent): Long

    @Delete
    suspend fun deleteFavoriteEvent(event: FavoriteEvent)

    @Query("SELECT * from favorite_event ORDER BY id ASC")
    fun getAllFavoriteEvent(): LiveData<List<FavoriteEvent>>
}