package com.example

class CabService {

    fun generateInvoice(listOfRides: List<Ride>) =
        "Total Fare: ${listOfRides.sumOf { it.calculateFare() }}"

    fun generateInvoice(ride: Ride) =
        "Total Fare: ${ride.calculateFare()}"


}