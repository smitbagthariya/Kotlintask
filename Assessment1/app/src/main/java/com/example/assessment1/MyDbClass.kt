package com.example.assessment1.viewmodel.com.example.assessment1

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import android.content.Context

@Database(entities = [User::class], version = 1)
abstract class MyDbClass : RoomDatabase() {

    abstract fun MyDao(): MyDao

    companion object {
        @Volatile
        private var INSTANCE: MyDbClass? = null

        fun getDatabase(context: Context): MyDbClass {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MyDbClass::class.java,
                    "user_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
