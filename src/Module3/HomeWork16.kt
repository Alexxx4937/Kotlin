package Module3

import kotlin.math.sqrt

/**
Задание 16: Корень числа
Напишите функцию для переменных типа Double, возвращающую корень числа
 */

fun main(args: Array<String>) {
    println("Введите число из которого необходимо извлечь корень")
    val number = readLine()!!.toDouble()
    println(number.mathRoot())
}

private fun Double.mathRoot(): Double {
    return sqrt(this)
}




