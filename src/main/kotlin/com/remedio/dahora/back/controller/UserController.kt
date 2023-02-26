package com.remedio.dahora.back.controller

import com.remedio.dahora.back.model.User
import com.remedio.dahora.back.service.UserService
import jakarta.annotation.security.PermitAll
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

//TODO: usar o Response entity no retorno das funcoes
//TODO: o security esta bloqueando as conexoes, liberar pra tudo quando voltar

@RestController
@RequestMapping("/users")
@PermitAll
class UserController(val service: UserService) {

    @PostMapping
    fun createUser(@RequestBody user : User){
        service.createUser(user)
    }
}