package com.remedio.dahora.back.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Meds (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var medId: Long,
    var medName: String,
    var medDesc: String,
    var medType: String,
    var medStatus: String,
)

//TODO: verificar com a galera oq cada remedio vai ter e etc