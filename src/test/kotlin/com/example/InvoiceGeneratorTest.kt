package com.example

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class InvoiceGeneratorTest : StringSpec({

    "A List of Rides should give the Total fare of all rides"{
        val listOfRides= listOf(Ride(5,10), Ride(10,20))

        InvoiceGenerator().generateInvoice(listOfRides) shouldBe 190
    }

    "A List of Rides should give a detailed invoice with Total Fare, Number of Rides and Average fare per Ride"{
        val listOfRides= listOf(Ride(5,10), Ride(10,21))

        InvoiceGenerator().generateDetailInvoice(listOfRides) shouldBe Invoice(191, 2, 95.5)
    }
})