fun main() {
    print("Введите число: ")
    val firstNumber = readln().toDouble()

    print("Введите знак: ")
    val symbol = readln()

    print("Введите число: ")
    val secondNumber = readln().toDouble()

    val result =
    when (symbol) {
        "+" -> firstNumber + secondNumber
        "-" -> firstNumber - secondNumber
        "*" -> firstNumber * secondNumber
        "/" -> firstNumber / secondNumber
        else -> 0
    }

    println("Результат: $result")
}