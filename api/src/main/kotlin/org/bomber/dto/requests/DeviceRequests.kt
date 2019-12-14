package org.bomber.dto.requests

data class CreateDeviceRequest(
    val name: String?,
    val ip: String
)

data class UpdateDeviceRequest(
    val name: String,
    val ip: String
)