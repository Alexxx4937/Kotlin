package Module4.Work22

open class Aircraft(aircraftNumber: String, maxFlightRange: Double, tankCapacity: Double) {
   protected  var aircraftNumb = aircraftNumber
    protected var maxFlightRanges = maxFlightRange
    protected var tankCap = tankCapacity
    protected var fuelConsumption: Double = 0.0
        get() = (tankCap / maxFlightRanges) * 100

    open fun infoAircraft() {
        println("Номер воздушного судна: $aircraftNumb;\nМаксимальная дальность полета: $maxFlightRanges;\nВместимость бака: $tankCap;\nРасход топлива на 100 км: $fuelConsumption")
    }
}
