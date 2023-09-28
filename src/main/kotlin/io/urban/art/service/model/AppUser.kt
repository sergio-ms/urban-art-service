package io.urban.art.service.model

import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.serde.annotation.Serdeable
import io.micronaut.serde.annotation.Serdeable.Deserializable

@MappedEntity
data class AppUser (
    @field:Id
    @field:GeneratedValue
    val id: String? = null,
    val name: String,
    val email: String,
    val address: Address
)

@Serdeable.Serializable
@Deserializable
data class Address(
    val street: String,
    val city: String,
    val code: Int
)