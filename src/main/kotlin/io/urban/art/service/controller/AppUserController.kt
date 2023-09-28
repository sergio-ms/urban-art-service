package io.urban.art.service.controller

import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.urban.art.service.model.Address
import io.urban.art.service.model.AppUser
import io.urban.art.service.model.request.AppUserRequest
import io.urban.art.service.service.AppUserService

@Controller("/user")
class AppUserController(
    private val appUserService: AppUserService
)
{
    @Post
    fun create(@Body appUserRequest: AppUserRequest) =
        appUserService.create(appUserRequest.toModel())

    private fun AppUserRequest.toModel(): AppUser =
        AppUser(
            name = this.name,
            email = this.email,
            address = Address(
                street = this.street,
                city = this.city,
                code = this.code
            )
        )
}