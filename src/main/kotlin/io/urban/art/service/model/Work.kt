package io.urban.art.service.model

import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity

@MappedEntity
data class Work (
    @field:Id
    @field:GeneratedValue
    val id: String? = null,
    val name: String,
    val description: String? = null,
    val lat: Double? = null,
    val long: Double? = null
    )