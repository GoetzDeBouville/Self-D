package org.bshhl.app.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import org.bshhl.app.data.db.dao.LinesDao
import org.bshhl.app.data.db.dao.TextSetDao
import org.bshhl.app.data.db.dao.TextSetLinesDao
import org.bshhl.app.data.db.entity.LineEntity
import org.bshhl.app.data.db.entity.TextSetEntity
import org.bshhl.app.data.db.entity.TextSetLinesEntity

@Database(
    version = 1,
    entities = [LineEntity::class, TextSetEntity::class, TextSetLinesEntity::class]
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun linesDao(): LinesDao
    abstract fun textSetDao(): TextSetDao
    abstract fun textSetLinesDao(): TextSetLinesDao
}