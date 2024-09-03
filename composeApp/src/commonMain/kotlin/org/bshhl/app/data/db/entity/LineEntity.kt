package org.bshhl.app.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "lines_table")
data class LineEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    val number: Int,
    val line: String,
    val lettersNum: Int = line.length,
    val timeSec: Int
)
