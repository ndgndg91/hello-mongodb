package com.ndgndg91.notification.controller

import com.ndgndg91.notification.controller.dto.request.CreateSettingsRequest
import com.ndgndg91.notification.controller.dto.response.SettingsResponse
import com.ndgndg91.notification.global.dto.response.ApiResponse
import com.ndgndg91.notification.service.SettingService
import org.springframework.http.HttpHeaders
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class SettingsController(
    private val service: SettingService
){
    @GetMapping("/apis/notification/settings")
    fun findSettings(
        @RequestHeader accountId: Long
    ): ResponseEntity<ApiResponse<SettingsResponse>> {
        return ResponseEntity.ok(
            ApiResponse(SettingsResponse(service.findByAccountId(accountId)))
        )
    }

    @PostMapping("/apis/notification/settings")
    fun saveSettings(
        @RequestBody body: CreateSettingsRequest
    ): ResponseEntity<ApiResponse<SettingsResponse>> {
        service.save(body)
        return ResponseEntity.noContent()
            .header(HttpHeaders.LOCATION, "/apis/notification/settings")
            .build()
    }
}