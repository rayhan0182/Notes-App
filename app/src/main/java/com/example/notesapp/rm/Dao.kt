package com.example.notesapp.rm

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface Dao {

    @Query("SELECT * FROM User")

    fun getdata(): List<User>

    @Insert

    fun insert(user: User)

    @Update

    fun update(user: User)

    @Delete

    fun delete(user: User)


}