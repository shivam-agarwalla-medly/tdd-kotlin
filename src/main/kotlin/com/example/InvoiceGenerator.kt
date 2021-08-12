package com.example

class InvoiceGenerator {

    fun generateInvoice(listOfRides: List<Ride>) =
        "Total Fare: ${listOfRides.sumOf { it.calculateFare() }}"
}