package Module1

/**
Задание 6: Сравнение
Напишите программу, которая запрашивает у пользователя два числа в переменные “a” и “b”.
Проверьте больше ли "a" чем "b" и получите результат в виде переменой типа boolean.
 */

fun main(args: Array<String>) {
    println("Сравнение двух чисел")
    println("Введите первое число")
    var aTemp: String? = readLine()
    println("Введите второе число")
    var bTemp: String? = readLine()
    val a: Double = aTemp!!.toDouble()
    val b: Double = bTemp!!.toDouble()
    if (a > b) {
        println("Число a=$a больше b=$b")
    } else
        println("Число a=$a меньше b=$b")
}