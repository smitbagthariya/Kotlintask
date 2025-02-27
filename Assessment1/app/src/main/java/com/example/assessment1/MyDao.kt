package com.example.assessment1.viewmodel.com.example.assessment1

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface MyDao {
    @Insert
    fun insertUser(user: User)

    @Query("SELECT * FROM users WHERE email = :email AND password = :password")
    fun getUser(email: String, password: String): User?
}
