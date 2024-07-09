package com.iurii.springcoredemo

import org.springframework.stereotype.Component

@Component
class CricketCoach : Coach {

    override fun getDailyWorkout() = "Practice fast bowling for 30 minutes"

}