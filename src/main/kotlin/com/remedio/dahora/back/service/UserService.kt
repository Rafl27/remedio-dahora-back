package com.remedio.dahora.back.service

import com.remedio.dahora.back.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService (val repository: UserRepository) {


    fun delete(id: Long) {
        repository.deleteById(id)
    }
}