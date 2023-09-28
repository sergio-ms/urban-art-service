package io.urban.art.service.model.request

import io.micronaut.core.annotation.Introspected
import io.micronaut.serde.annotation.Serdeable

@Introspected
@Serdeable.Deserializable
data class AppUserRequest (
    val name: String,
    val email: String,
    val street: String,
    val city: String,
    val code: Int

)