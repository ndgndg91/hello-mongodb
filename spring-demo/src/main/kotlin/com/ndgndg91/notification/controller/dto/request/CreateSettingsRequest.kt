package com.ndgndg91.notification.controller.dto.request

data class CreateSettingsRequest(
    val accountId: Long,
    val orderExecution: Boolean,
    val stopOrderTrigger: Boolean,
    val fiatDepositWithdraw: Boolean,
    val cryptoDepositWithdraw: Boolean,
    val priceChange: Boolean,
    val highLowAlert: Boolean,
    val targetPriceAlert: Boolean,
    val eventAlert: Boolean,
    val communityAlert: Boolean,
    val doNotDisturb: Boolean,
    val doNotDisturbStart: String,
    val doNotDisturbEnd: String
)
