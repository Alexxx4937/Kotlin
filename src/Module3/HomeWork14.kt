package Module3

/**
 * Задание 14: Инфо сотрудника
Напишите функцию, которая выводит в консоль информацию сотрудника (ФИО, Возраст, Должность и Семейное положение). С помощью перегрузки функции,
сделайте варианты, когда известны только:
- ФИО и Должность
- ФИО, Возраст и Должность
- ФИО, Семейное положение и Должность
- ФИО, Возраст, Семейное положение и Должность

 */

fun main(args: Array<String>) {
infoSotrud("Петров Василий Петрович",30,"Холост","Инженер")
}

private fun infoSotrud(nameSotrudnik: String, position: String) {
    println("ФИО сотрудника: $nameSotrudnik;\nДолжность: $position;\n")
}

private fun infoSotrud(nameSotrudnik: String, age: Int, position: String) {
    println("ФИО сотрудника: $nameSotrudnik;\nВозраст: $age;\nДолжность: $position;\n")
}

private fun infoSotrud(nameSotrudnik: String, maritalStatus: String, position: String) {
    println("ФИО сотрудника: $nameSotrudnik;\nСемейное положение: $maritalStatus;\nДолжность: $position;\n")
}

private fun infoSotrud(nameSotrudnik: String,age: Int, maritalStatus: String, position: String) {
    println("ФИО сотрудника: $nameSotrudnik;\nВозраст: $age;\nСемейное положение: $maritalStatus;\nДолжность: $position;\n")
}
