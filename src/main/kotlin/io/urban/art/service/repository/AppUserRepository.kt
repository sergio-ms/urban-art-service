package io.urban.art.service.repository

import io.micronaut.data.mongodb.annotation.MongoRepository
import io.micronaut.data.repository.CrudRepository
import io.urban.art.service.model.AppUser

@MongoRepository
interface AppUserRepository : CrudRepository<AppUser, String?> {
}