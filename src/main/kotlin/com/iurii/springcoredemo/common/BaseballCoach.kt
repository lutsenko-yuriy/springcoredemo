package com.iurii.springcoredemo.common

import org.springframework.stereotype.Component

@Component
class BaseballCoach : Coach {

    init {
        println("Baseball Coach init")
    }

    override fun getDailyWorkout() = "Spend 30 minutes in batting practice!"

}