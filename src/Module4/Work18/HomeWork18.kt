package Module4.Work18

/**
Задание 18: Авиакомпания 2. Конструктор
Усовершенствуйте программу для авиакомпании. Пусть свойства: номер воздушного судна, максимальная дальность полета и вместимость бака определяются через конструктор.
Для этих свойств значения определять не надо.
 */

fun main(args: Array<String>) {
 val aircraft=Aircraft("A-320",6100.0,24210.0)
    println(aircraft.fuelConsumption)
}




