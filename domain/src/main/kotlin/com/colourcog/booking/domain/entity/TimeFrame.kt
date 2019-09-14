package com.colourcog.booking.domain.entity

import java.time.LocalDateTime

data class TimeFrame (val dateFrom: LocalDateTime, val dateTo: LocalDateTime) {
    fun overlaps(other: TimeFrame): Boolean {
        return dateFrom <= other.dateTo && dateTo >= other.dateFrom
    }
}