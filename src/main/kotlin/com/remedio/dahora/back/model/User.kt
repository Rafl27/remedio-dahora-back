package com.remedio.dahora.back.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id


@Entity
data class User(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,
        val username: String,
        val password: String,
        val email: String,
        val role: String,
)