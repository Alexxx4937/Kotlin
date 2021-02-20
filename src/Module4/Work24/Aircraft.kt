package Module4.Work24

open class Aircraft(aircraftNumber: String, maxFlightRange: Double, tankCapacity: Double) {
    var aircraftNumb = aircraftNumber
    var maxFlightRanges = maxFlightRange
    var tankCap = tankCapacity
    var fuelConsumption: Double = 0.0
        get() = (tankCap / maxFlightRanges) * 100

    open fun infoAircraft() {
        println("Номер воздушного судна: $aircraftNumb;\nМаксимальная дальность полета: $maxFlightRanges;\nВместимость бака: $tankCap;\nРасход топлива на 100 км: $fuelConsumption")
    }
}
