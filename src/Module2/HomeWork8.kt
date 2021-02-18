package Module2

/**
Задание 8: Проценты по вкладу
Напишите программу для расчета дохода по вкладу. Пользователь вводит сумму вклада, длительность вклада (количество месяцев) и ежемесячный процент по вкладу.
Программа выводит в консоль информацию по каждому месяцу отдельно. Информация отображает: на сколько будет увеличиваться вклад
в этом месяце и итоговую сумму вклада в данном месяце.
 */

fun main(args: Array<String>) {
    println("Программа для расчета дохода по вкладу")
    println()
    println("Введите сумму вклада")
    var summ: Double = readLine()!!.toDouble()
    println("Введите длительнось вклада(количество месяцев)")
    val month: Int = readLine()!!.toInt()
    println("Введите ежемесячный процент по вкладу")
    val percent: Double = readLine()!!.toDouble()
    for (months in 1..month) {
        var profit: Double = (summ * percent) / 100
        summ += profit
        println("$months - й месяц:")
        println("Сумма вклада $summ")
        println("Прибыль $profit")
    }
}