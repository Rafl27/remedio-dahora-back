package com.remedio.dahora.back.service

import com.remedio.dahora.back.model.Meds
import com.remedio.dahora.back.repository.MedsRepository
import org.springframework.stereotype.Service

@Service
class MedsService (val repository : MedsRepository) {
    fun getMeds(): MutableList<Meds> {
        return repository.findAll();
    }
}