package ru.netology

fun main() {

    println(commissionCalculation("Visa", 1000, 79000))

}

fun commissionCalculation(
    cardType: String = "Vk Pay",
    previousTranslations: Int = 0,
    transferAmount: Int,
): Int {
    val commission = when (cardType) {
        "VK Pay" -> 0

        "Mastercard", "Maestro" ->             if ((transferAmount > 300) && ((previousTranslations + transferAmount) < 75000)){
            0
        } else {(transferAmount*0.006 + 20).toInt()}

        "Visa", "Мир" -> if (transferAmount * 0.075 < 35) {
            35
        } else {
            (transferAmount * 0.075).toInt()
        }
        else -> 0
    }
    return commission
}

