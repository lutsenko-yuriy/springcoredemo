package com.iurii.springcoredemo.common

import org.springframework.context.annotation.Lazy
import org.springframework.stereotype.Component

@Lazy
@Component
class CricketCoach : Coach {

    init {
        println("Cricket Coach init")
    }

    override fun getDailyWorkout() = "Practice fast bowling for 45 minutes"

}