package Module3

/**
Задание 13: Количество сотрудников
Напишите функцию, принимающую на вход имена сотрудников и возвращающую их количество. Используйте для этого vararg, из предыдущей темы.

 */

fun main(args: Array<String>) {
    val name= arrayOf("Петров","Сидоров","Тютчев")
    println("Количество сотрудников: ${countSotrud(*name)}")
}
private fun countSotrud(vararg nameSotrudnik:String):Int{
    return nameSotrudnik.size
}
