package Module4.Work23

/**
Задание 23: Data class
Создайте data класс для автомобилей. Он должен содержать марку автомобиля, цвет и номер.

Выведите информацию об автомобилях в консоль.

 */

fun main(args: Array<String>) {
    val toyota = CarData("Toyota Camry", "Черный", "А001МР777")
    val kia = CarData("Kia Rio", "Белый", "С493НА150")
    println("$toyota \n$kia")

}




