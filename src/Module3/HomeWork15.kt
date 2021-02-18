package Module3

/**
Задание 15: Лямбда
Создайте переменную, которая содержит лямбда выражение для вывода в консоль данных массива типа String.
 */

fun main(args: Array<String>) {
    val day = { arrayDay: Array<String> ->
        for (arr in arrayDay) {
            println(arr)
        }
    }
    day(arrayOf("Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"))
}



