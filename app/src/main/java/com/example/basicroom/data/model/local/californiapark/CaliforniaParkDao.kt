package com.example.basicroom.data.model.local.californiapark

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CaliforniaParkDao {
    @Query("SELECT * FROM PARK")
    suspend fun getAll(): List<CaliforniaPark>

    @Insert
    suspend fun insertAll(parks: List<CaliforniaPark>)
}