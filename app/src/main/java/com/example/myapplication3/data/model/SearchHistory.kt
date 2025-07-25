package com.example.myapplication3.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class SearchHistory(
    @PrimaryKey val query: String,
    val timestamp: Long
)
