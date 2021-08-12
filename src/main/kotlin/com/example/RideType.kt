package com.example

enum class RideType(val FARE_PER_KM : Int, val FARE_PER_MINUTE : Int, val BOOKING_CHARGE : Int) {

    STANDARD(10,1,5),

    PREMIUM(15,2,5)
}