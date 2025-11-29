package com.example.notesapp.rm

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(

    @PrimaryKey(autoGenerate = true)

    val id: Int,

    val notes: String

)
