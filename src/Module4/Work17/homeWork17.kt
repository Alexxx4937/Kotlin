package Module4.Work17

/**
Задание 17: Авиакомпания 1
Поможем авиакомпании в создании программы для учета авиапарка.

Создайте класс Aircraft и реализуйте в нем свойства, содержащие следующее:  номер воздушного судна, максимальная дальность полета, вместимость бака,
расход топлива на 100 км. Установите значения по своему усмотрению.
Переопределите геттер свойства содержащего расход топлива, чтобы он самостоятельно рассчитывался из свойств дальности полета и вместимости бака.
 */

fun main(args: Array<String>) {
 val aircraft=Aircraft()
    println(aircraft.fuelConsumption)
}




