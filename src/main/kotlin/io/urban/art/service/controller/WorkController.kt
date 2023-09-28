package io.urban.art.service.controller

import io.urban.art.service.model.Work
import io.urban.art.service.model.request.WorkRequest
import io.urban.art.service.service.WorkService
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.*

@Controller("/work")
class WorkController(
    val workService: WorkService
)
{
    @Post
    @Status(HttpStatus.CREATED)
    fun create(@Body workRequest: WorkRequest) =
        workService.create(workRequest.toModel())

    @Get
    fun getAll() =
        workService.getAll()

    @Get("/{id}")
    fun getById(id: String) =
        workService.getById(id)

    private fun WorkRequest.toModel(): Work =
        Work(
            name = this.name,
            description = this.description,
            lat = this.lat,
            long = this.long
        )


}