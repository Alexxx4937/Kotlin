package Module4.Work20

open class Aircraft(aircraftNumber: String, maxFlightRange: Double, tankCapacity: Double) {
    var aircraftNumb = aircraftNumber
    var maxFlightRanges = maxFlightRange
    var tankCap=tankCapacity
    var fuelConsumption: Double = 0.0
        get() = (tankCap / maxFlightRanges) * 100
}