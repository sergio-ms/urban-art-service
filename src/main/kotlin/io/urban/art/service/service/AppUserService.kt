package io.urban.art.service.service

import io.urban.art.service.model.AppUser
import io.urban.art.service.repository.AppUserRepository
import jakarta.inject.Singleton

@Singleton
class AppUserService(
    private val appUserRepository: AppUserRepository
)
{
    fun create(appUser: AppUser) = appUserRepository.save(appUser)
}