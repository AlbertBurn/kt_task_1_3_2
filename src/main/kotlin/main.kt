package ru.netology

fun main() {

    println(commisionCalculation("Visa", 1000, 79000))

}

fun commisionCalculation(
    cardType: String = "Vk Pay",
    previousTranslations: Int = 0,
    transferAmount: Int,
): Double {
    val commision = when (cardType) {
        "VK Pay" -> 0

        "Mastercard", "Maestro" ->             if (transferAmount > 300 && previousTranslations < 75000){

        } else {transferAmount*0.006 + 20}

        "Visa", "Мир" -> if (transferAmount * 0.075 < 35) {
            35
        } else {
            transferAmount * 0.075
        }
        else -> 0
    }
    return commision as Double
}

