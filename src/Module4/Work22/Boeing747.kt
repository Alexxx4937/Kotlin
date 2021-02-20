package Module4.Work22

class Boeing747(aircraftNumber: String, maxFlightRange: Double, tankCapacity: Double,override val capacityPass:Int) :
    Aircraft(aircraftNumber, maxFlightRange, tankCapacity),Passenger{
    override fun infoAircraft() {
        println("Номер воздушного судна: $aircraftNumb;\nМаксимальная дальность полета: $maxFlightRanges;\nВместимость бака: $tankCap;\nРасход топлива на 100 км: $fuelConsumption;\nКоличество пасажиров: $capacityPass")
    }
}
