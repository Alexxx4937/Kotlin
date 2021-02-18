package Module3

/**
Задание 12: Високосный год
Напишите функцию, которая получает в параметры какой-либо год, проверяет високосный ли это год и возвращает результат проверки.

 */

fun main(args: Array<String>) {
    println("Проверка на високосный год. Введите год: ")
if(checkLeapYear(readLine()!!.toInt())){
    println("Год високосный")
}
    else println("Год не является високсоным")
}

private fun checkLeapYear(year: Int): Boolean {
    if (year % 100 == 0 && year % 400 == 0 ||year % 4 == 0 && year % 100 >0) {
        return true
    }
    return false
}
