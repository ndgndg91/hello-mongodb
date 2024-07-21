package com.ndgndg91.notification.service

import com.ndgndg91.notification.controller.dto.request.CreateSettingsRequest
import com.ndgndg91.notification.domain.*
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.lang.RuntimeException

@Service
class SettingService(
    private val repository: SettingsRepository
) {

    fun findByAccountId(accountId: Long): Settings {
        return repository.findByIdOrNull(accountId)
            ?: throw RuntimeException()
    }

    fun save(body: CreateSettingsRequest) {
        repository.save(Settings(
            accountId = body.accountId,
            general = GeneralSettings(
                orderExecution = body.orderExecution,
                stopOrderTrigger = body.stopOrderTrigger,
                fiatDepositWithdraw = body.fiatDepositWithdraw,
                cryptoDepositWithdraw = body.cryptoDepositWithdraw
            ),
            market = MarketSettings(
                priceChange = body.priceChange,
                highLowAlert = body.highLowAlert,
                targetPriceAlert = body.targetPriceAlert
            ),
            events = EventSettings(
                listingNotice = true,
                eventAlert = body.eventAlert,
                communityAlert = body.communityAlert
            ),
            doNotDisturb = DoNotDisturb(
                enabled = body.doNotDisturb,
                startTime = body.doNotDisturbStart,
                endTime = body.doNotDisturbEnd
            )
        ))
    }
}