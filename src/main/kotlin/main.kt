fun main() {
    greeting()

    while (true) {
        print("Введите число: ")
        val firstNumber = readln().toDoubleOrNull()
        if (firstNumber == null) {
            println("Введено некорректное значение. Завершаю работу...")
            return
        }

        print("Введите знак: ")
        val symbol = readln()[0]

        print("Введите число: ")
        val secondNumber = readln().toDoubleOrNull()
        if (secondNumber == null) {
            println("Введено некорректное значение. Завершаю работу...")
            return
        }

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
            "#########################################################\n")
}

fun calculate(firstNumber: Double, secondNumber: Double, symbol: Char): Double {
    return when (symbol) {
        '+' -> firstNumber + secondNumber
        '-' -> firstNumber - secondNumber
        '*' -> firstNumber * secondNumber
        '/' -> firstNumber / secondNumber
        else -> 0.0
    }
}