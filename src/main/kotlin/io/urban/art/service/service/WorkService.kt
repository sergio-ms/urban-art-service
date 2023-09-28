package io.urban.art.service.service

import io.urban.art.service.model.Work
import io.urban.art.service.repository.WorkRepository
import io.micronaut.http.HttpStatus
import io.micronaut.http.exceptions.HttpStatusException
import jakarta.inject.Singleton

@Singleton
class WorkService(
    private val workRepository: WorkRepository
)
{
    fun create(work: Work) = workRepository.save(work)
    fun getAll(): List<Work> =
        workRepository.findAll()

    fun getById(id: String): Work = workRepository.findById(id)
        .orElseThrow {HttpStatusException(HttpStatus.NOT_FOUND, "Work with id $id was not found.")}




}
