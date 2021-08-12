package com.example

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class CabServiceTest : StringSpec({

    "A List of Rides should give the Total fare of all rides"{
        val listOfRides= listOf(Ride(5,10), Ride(10,20))

        CabService().generateInvoice(listOfRides) shouldBe "Total Fare: 190"
    }
})