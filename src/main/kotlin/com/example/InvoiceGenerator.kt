package com.example

class InvoiceGenerator {

    fun generateInvoice(listOfRides: List<Ride>) =
        listOfRides.sumOf { it.calculateFare() }

    fun generateDetailInvoice(listOfRides: List<Ride>) : Invoice {
        val totalFare = listOfRides.sumOf { it.calculateFare() }

        return Invoice( totalFare, listOfRides.size, totalFare/listOfRides.size.toDouble() )
    }
}