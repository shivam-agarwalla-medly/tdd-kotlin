package com.example

class Ride (
    private val KmTravelled : Int,
    private val minuteTravelled : Int
)
{
    companion object {
        private const val FARE_PER_KM = 10
        private const val FARE_PER_MINUTE = 1
        private const val BOOKING_CHARGE = 5
    }

    fun calculateFare() =
        KmTravelled * FARE_PER_KM + minuteTravelled * FARE_PER_MINUTE + BOOKING_CHARGE

}