package com.iurii.springcoredemo.common

import org.springframework.stereotype.Component

@Component
class TennisCoach : Coach {

    override fun getDailyWorkout() = "Practice your backhand volley"

}