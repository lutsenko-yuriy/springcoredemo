package com.iurii.springcoredemo.common

import org.springframework.stereotype.Component

@Component
class BaseballCoach : Coach {

    override fun getDailyWorkout() = "Spend 30 minutes in batting practice!"

}