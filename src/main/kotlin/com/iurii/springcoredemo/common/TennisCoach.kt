package com.iurii.springcoredemo.common

import org.springframework.stereotype.Component

@Component
class TennisCoach : Coach {

    init {
        println("Tennis Coach init")
    }

    override fun getDailyWorkout() = "Practice your backhand volley"

}