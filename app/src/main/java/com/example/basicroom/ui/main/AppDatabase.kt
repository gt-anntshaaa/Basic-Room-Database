package com.example.basicroom.ui.main

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.basicroom.data.model.local.californiapark.CaliforniaPark
import com.example.basicroom.data.model.local.californiapark.CaliforniaParkDao

@Database(entities = [CaliforniaPark::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun californiaParkDao(): CaliforniaParkDao


    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null
        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context,
                    AppDatabase::class.java,
                    "app_database"
                )
                    .createFromAsset("data.db")
                    .build()
                INSTANCE = instance

                instance
            }
        }
    }
}