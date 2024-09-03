package org.bshhl.app.domain.models

data class Line(
    val id: Int,
    val number: Int,
    val line: String,
    val lettersNum: Int,
    val timeSec: Int
)
