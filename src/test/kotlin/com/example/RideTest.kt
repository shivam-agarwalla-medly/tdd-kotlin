package com.example

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class RideTest: StringSpec({

    "No Travel should give Total Fare as the booking fare only"{
        Ride(0, 0).calculateFare() shouldBe 5
    }

    "A single Ride should give the correct Total Fare as per Logic"{
        Ride(5, 10).calculateFare() shouldBe 65
    }
})