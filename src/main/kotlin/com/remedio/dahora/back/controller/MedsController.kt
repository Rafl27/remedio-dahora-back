package com.remedio.dahora.back.controller

import com.remedio.dahora.back.model.Meds
import com.remedio.dahora.back.service.MedsService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/meds")
class MedsController (private val service: MedsService){
    @RequestMapping()
    fun findAllMeds(): MutableList<Meds> {
        return service.getMeds()
    }
}