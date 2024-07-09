package com.iurii.springcoredemo.common

import org.springframework.context.annotation.Lazy
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

@Lazy
@Primary
@Component
class TennisCoach : Coach {

    init {
        println("Tennis Coach init")
    }

    override fun getDailyWorkout() = "Practice your backhand volley"

}