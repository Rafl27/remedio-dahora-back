package com.remedio.dahora.back.repository

import com.remedio.dahora.back.model.Meds
import org.springframework.data.jpa.repository.JpaRepository

interface MedsRepository : JpaRepository<Meds, Long> {
}