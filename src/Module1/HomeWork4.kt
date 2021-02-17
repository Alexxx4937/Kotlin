package Module1

/**
Задание 4: Приветствие пользователя
Напишите программу, запрашивающую имя пользователя и выводящую приветствие пользователя в консоль, после ввода
имени.
 */

fun main(args: Array<String>) {
    println("Введите ваше имя: ")
    val userText: String? = readLine()
    val userName: String = userText.toString()
    println("Добро пожаловать $userName")
}