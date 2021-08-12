package com.example

class Ride (
    private val KmTravelled : Int,
    private val minuteTravelled : Int
)
{
    private val FARE_PER_KM=10
    private val FARE_PER_MINUTE=1
    private val BOOKING_CHARGE=5

    fun calculateFare() =
        KmTravelled * FARE_PER_KM + minuteTravelled * FARE_PER_MINUTE + BOOKING_CHARGE

}