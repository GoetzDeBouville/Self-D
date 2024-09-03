package org.bshhl.app.data.db.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import org.bshhl.app.data.db.entity.TextSetLinesEntity

@Dao
interface TextSetLinesDao {
    @Upsert
    suspend fun insertLinesSet(setLines: TextSetLinesEntity)

    @Query("SELECT * FROM text_set_lines WHERE textSetId = :setId")
    suspend fun getLinesBySetId(setId: Int): List<TextSetLinesEntity>
}