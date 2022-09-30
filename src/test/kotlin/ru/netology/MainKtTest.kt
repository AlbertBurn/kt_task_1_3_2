package ru.netology

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun commissionCalculationVk() {
        val cardType = "Vk Pay"
        val previousTranslations = 1000
        val transferAmount = 79000

        val result = commissionCalculation(cardType, previousTranslations, transferAmount)

        assertEquals(0, result)
    }

    @Test
    fun commissionCalculationMc() {
        val cardType = "Mastercard"
        val previousTranslations = 1000
        val transferAmount = 6000

        val result = commissionCalculation(cardType, previousTranslations, transferAmount)

        assertEquals(0, result)
    }

    @Test
    fun commissionCalculationMcHundredTranslation() {
        val cardType = "Mastercard"
        val previousTranslations = 6000000
        val transferAmount = 100

        val result = commissionCalculation(cardType, previousTranslations, transferAmount)

        assertEquals(20, result)
    }

    @Test
    fun commissionCalculationMcLimitOff() {
        val cardType = "Mastercard"
        val previousTranslations = 1000
        val transferAmount = 50000000

        val result = commissionCalculation(cardType, previousTranslations, transferAmount)

        assertEquals(30002, result)
    }

    @Test
    fun commissionCalculationMaestroLimitOff() {
        val cardType = "Maestro"
        val previousTranslations = 1000
        val transferAmount = 79000

        val result = commissionCalculation(cardType, previousTranslations, transferAmount)

        assertEquals(494, result)
    }

    @Test
    fun commissionCalculationMaestro() {
        val cardType = "Maestro"
        val previousTranslations = 1000
        val transferAmount = 4500

        val result = commissionCalculation(cardType, previousTranslations, transferAmount)

        assertEquals(0, result)
    }

    @Test
    fun commissionCalculationVisa() {
        val cardType = "Visa"
        val previousTranslations = 1000
        val transferAmount = 700

        val result = commissionCalculation(cardType, previousTranslations, transferAmount)

        assertEquals(52, result)
    }

    @Test
    fun commissionCalculationVisalimitOff() {
        val cardType = "Visa"
        val previousTranslations = 1000
        val transferAmount = 7000000

        val result = commissionCalculation(cardType, previousTranslations, transferAmount)

        assertEquals(525000, result)
    }

    @Test
    fun commissionCalculationUnionPay() {
        val cardType = "Union Pay"
        val previousTranslations = 1000
        val transferAmount = 79000

        val result = commissionCalculation(cardType, previousTranslations, transferAmount)

        assertEquals(0, result)
    }
}