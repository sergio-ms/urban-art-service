package io.urban.art.service.repository

import io.micronaut.data.mongodb.annotation.MongoRepository
import io.micronaut.data.repository.CrudRepository
import io.urban.art.service.model.Work

@MongoRepository
interface WorkRepository : CrudRepository<Work, String?> {
}