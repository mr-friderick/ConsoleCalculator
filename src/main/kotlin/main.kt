fun main() {
    greeting()

    while (true) {
        print("Введите число: ")
        val firstNumber = readln().toDouble()

        print("Введите знак: ")
        val symbol = readln()

        print("Введите число: ")
        val secondNumber = readln().toDouble()

        val result = calculate(firstNumber, secondNumber, symbol)

        println("\nРезультат: $result \n")

        println("Продолжаем? y/n")
        val answer = readln()
        if (answer == "y") continue else return
    }
}

fun greeting() {
    println("\n#########################################################\n" +
            "############ Добро пожаловать в калькулятор! ############\n" +
            "#########################################################\n" +
            "### Чтобы завершить работу с программой введите 'end' ###\n")
}

fun calculate(firstNumber: Double, secondNumber: Double, symbol: String): Double {
    return when (symbol) {
        "+" -> firstNumber + secondNumber
        "-" -> firstNumber - secondNumber
        "*" -> firstNumber * secondNumber
        "/" -> firstNumber / secondNumber
        else -> 0.0
    }
}