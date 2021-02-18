package Module2

/**
Задание 10: Города
Напишите программу для хранения названия городов. Пользователь может сделать 4 действия:
- Добавить название города в программу.
- Посмотреть в консоли список всех добавленных городов
- Посмотреть список добавленных городов без повторений
- Выход из программы
Для хранения используйте коллекцию типа List.
 */

fun main(args: Array<String>) {
    val nameCity = arrayListOf<String>()
    var numberWork: Int = 0
    loop@ while (true) {
        println(
            "1 Добавить название города в программу.\n2 Посмотреть в консоли список всех добавленных городов\n3 Посмотреть список добавленных городов без повторений\n4 Выход из программы"
        )
        println("Какое действие вы хотите выполнить \n Введите цифру:")
        try {
            numberWork = readLine()!!.toInt()
        } catch (e: NumberFormatException) {
            println("Вы ничего не ввели или ввели не цифру")
        }
        when (numberWork) {
            1 -> {
                println("Введите название города")
                val nameCites: String = readLine()!!.toString()
                nameCity.add(nameCites)
                println("Город $nameCites добавлен в список")
            }
            2 -> {
                if (nameCity.isEmpty()) {
                    println("Список пуст")
                    continue@loop
                }
                for (iterat in nameCity) {
                    println(iterat)
                }
            }
            3 -> {
                val nameCitySet = linkedSetOf<String>()
                nameCitySet.addAll(nameCity)
                if (nameCitySet.isEmpty()) {
                    println("Список пуст")
                    continue@loop
                }
                for (iterat in nameCitySet) {
                    println(iterat)
                }
            }
            4 -> {
                break@loop
            }
            else -> println("Такого действия нет. Выберите цифру от 1 до 4")
        }
    }
}
