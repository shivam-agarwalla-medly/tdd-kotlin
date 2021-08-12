package com.example

class CabService {

    private val FARE_PER_KM=10
    private val FARE_PER_MINUTE=1
    private val BOOKING_CHARGE=5

    fun generateInvoice(listOfRides: List<Ride>) =
        "Total Fare: ${listOfRides.sumOf { calculateFare(it) }}"

    private fun calculateFare(ride : Ride) =
        ride.KmTravelled * FARE_PER_KM + ride.minuteTravelled * FARE_PER_MINUTE + BOOKING_CHARGE

}