package Module4.Work24

class IL76(aircraftNumber: String, maxFlightRange: Double, tankCapacity: Double, override val liftingСapacity: Double) :
    Aircraft(aircraftNumber, maxFlightRange, tankCapacity),CargoAirplane {
    override fun infoAircraft() {
        println("Номер воздушного судна: $aircraftNumb;\nМаксимальная дальность полета: $maxFlightRanges км;\nВместимость бака: $tankCap л;\nРасход топлива на 100 км: $fuelConsumption л/100км;\nГрузоподъемность: $liftingСapacity кг")
    }
}