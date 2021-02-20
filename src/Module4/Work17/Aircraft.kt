package Module4.Work17

class Aircraft {
    var aircraftNumber: String = "A-320"
    var maxFlightRange: Double = 6100.0
    var tankCapacity: Double = 24210.0
    var fuelConsumption: Double = 0.0
        get() =(tankCapacity/maxFlightRange)*100
}