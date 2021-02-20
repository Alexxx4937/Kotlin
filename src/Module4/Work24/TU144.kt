package Module4.Work24

class TU144(aircraftNumber: String, maxFlightRange: Double, tankCapacity: Double, override val capacityPass: Int) :
    Aircraft(aircraftNumber, maxFlightRange, tankCapacity), Passenger {
    override fun infoAircraft() {
        println("Номер воздушного судна: $aircraftNumb;\nМаксимальная дальность полета: $maxFlightRanges км;\nВместимость бака: $tankCap л;\nРасход топлива на 100 км: $fuelConsumption л/100км;\nКоличество пасажиров: $capacityPass чел")
    }
}