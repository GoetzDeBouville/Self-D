package org.bshhl.app.data

import com.hellcorp.selfdictation.domain.models.TextSet
import org.bshhl.app.data.db.entity.LineEntity
import org.bshhl.app.data.db.entity.TextSetEntity
import org.bshhl.app.domain.models.Line

fun Line.toEntity() = LineEntity(
    id, number, line, lettersNum, timeSec
)

fun LineEntity.toDomain() = Line(
    id, number, line, lettersNum, timeSec
)

fun TextSet.toEntity() = TextSetEntity(
    id, name, classNumber
)

fun TextSetEntity.toDomain() = TextSet(
    id, name, classNumber
)