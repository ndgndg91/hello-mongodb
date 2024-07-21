package com.ndgndg91.notification.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collation = "push_history")
data class PushHistory(
    @Id
    val id: String? = null,
    val userId: String,
    val category: String,
    val type: String,
    val message: String,
    val action: String,
    val read: Boolean,
    val timestamp: LocalDateTime
)