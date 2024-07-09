package com.iurii.springcoredemo.common

import org.springframework.stereotype.Component

@Component
class TrackCoach : Coach {

    init {
        println("Track Coach init")
    }

    override fun getDailyWorkout() = "Run a hard 5k!"

}