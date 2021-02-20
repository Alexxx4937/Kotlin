package Module4.Work21

class Boeing747(aircraftNumber: String, maxFlightRange: Double, tankCapacity: Double,override val capacityPass:Int) :
    Aircraft(aircraftNumber, maxFlightRange, tankCapacity),Passenger
