package com.example

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class CabServiceTest : StringSpec({

    "No Travel should give Total Fare as the booking fare only"{
        val listOfRides = listOf(Ride(0, 0))

        CabService().generateInvoice(listOfRides) shouldBe "Total Fare: 5"
    }

    "A single Ride should give the correct Total Fare as per Logic"{
        val listOfRides = listOf(Ride(5, 10))

        CabService().generateInvoice(listOfRides) shouldBe "Total Fare: 65"
    }

    "A List of Rides should give the Total fare of all rides"{
        val listOfRides= listOf(Ride(5,10), Ride(10,20))

        CabService().generateInvoice(listOfRides) shouldBe "Total Fare: 190"
    }
})