package com.example

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class InvoiceTest : StringSpec({

    "A List of Standard Rides should give Total Fare, Number of Rides and Average fare per Ride"{
        val listOfRides= listOf(Ride(5,10, RideType.STANDARD), Ride(10,21, RideType.STANDARD))

        Invoice(listOfRides).getTotalFare() shouldBe 191
        Invoice(listOfRides).getNumberOfRides() shouldBe 2
        Invoice(listOfRides).getAverageFarePerRide() shouldBe 95.5
    }

    "A List of Mixed Rides should give Total Fare, Number of Rides and Average fare per Ride"{
        val listOfRides= listOf(Ride(5,10, RideType.STANDARD), Ride(10,20, RideType.PREMIUM))

        Invoice(listOfRides).getTotalFare() shouldBe 260
        Invoice(listOfRides).getNumberOfRides() shouldBe 2
        Invoice(listOfRides).getAverageFarePerRide() shouldBe 130.0
    }
})