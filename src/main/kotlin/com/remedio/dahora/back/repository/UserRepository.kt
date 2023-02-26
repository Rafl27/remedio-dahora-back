package com.remedio.dahora.back.repository

import com.remedio.dahora.back.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
}