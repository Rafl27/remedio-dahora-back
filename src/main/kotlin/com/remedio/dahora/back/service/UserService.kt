package com.remedio.dahora.back.service

import com.remedio.dahora.back.model.User
import com.remedio.dahora.back.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class UserService (val repository: UserRepository, @Autowired val passwordEncoder: PasswordEncoder) {

    fun createUser(user: User): String {
        val hashedPassword = passwordEncoder.encode(user.password)
        user.password = hashedPassword
        repository.save(user)
        return "${user.username} has been created"
    }

    fun delete(id: Long): String {
        repository.deleteById(id)
        return "User with the id ${id} has been deleted"
    }
}