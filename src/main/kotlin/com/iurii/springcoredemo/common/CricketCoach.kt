package com.iurii.springcoredemo.common

import org.springframework.stereotype.Component

@Component
class CricketCoach : Coach {

    init {
        println("Cricket Coach init")
    }

    override fun getDailyWorkout() = "Practice fast bowling for 45 minutes"

}