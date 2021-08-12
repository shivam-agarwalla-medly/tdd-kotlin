package com.example

class Invoice(listOfRides : List<Ride>)
{
    private val totalFare : Int
    private val numberOfRides : Int
    private val averageFarePerRide : Double

    init{
        totalFare=listOfRides.sumOf { it.calculateFare() }
        numberOfRides=listOfRides.size
        averageFarePerRide=totalFare.toDouble()/numberOfRides
    }

    fun getTotalFare() = totalFare

    fun getNumberOfRides() = numberOfRides

    fun getAverageFarePerRide() = averageFarePerRide
}