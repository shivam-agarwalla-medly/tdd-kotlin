package com.example

class Ride (
    private val KmTravelled : Int,
    private val minuteTravelled : Int,
    private val typeOfRide : RideType
)
{
    fun calculateFare() =
        KmTravelled * typeOfRide.FARE_PER_KM + minuteTravelled * typeOfRide.FARE_PER_MINUTE + typeOfRide.BOOKING_CHARGE
}