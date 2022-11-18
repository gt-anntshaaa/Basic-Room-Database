package com.example.basicroom.data.model.local.californiapark

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "PARK")
data class CaliforniaPark(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "city") val city: String,
    @ColumnInfo(name = "area_acres") val acres: String,
    @ColumnInfo(name = "park_visitor") val park: String,
    @ColumnInfo(name = "established") val established: String,
    @ColumnInfo(name = "type") val type: String
)
