package org.bshhl.app.data.db.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import org.bshhl.app.data.db.entity.LineEntity

@Dao
interface LinesDao {
    @Upsert
    suspend fun insertLine(line: LineEntity)

    @Query("SELECT * FROM lines_table")
    suspend fun getLines(): List<LineEntity>

    @Query("SELECT * FROM lines_table WHERE id = :id ORDER BY number ASC")
    suspend fun getLineById(id: Int): LineEntity?

    @Query("SELECT MAX(id) FROM lines_table")
    suspend fun getLastId(): Int

    @Query("DELETE FROM lines_table WHERE id = :id")
    suspend fun removeLineById(id: Int)
}