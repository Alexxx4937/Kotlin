package Module4.Work21

abstract class Aircraft(aircraftNumber: String, maxFlightRange: Double, tankCapacity: Double) {
    var aircraftNumb = aircraftNumber
    var maxFlightRanges = maxFlightRange
    var tankCap=tankCapacity
    var fuelConsumption: Double = 0.0
        get() = (tankCap / maxFlightRanges) * 100
}