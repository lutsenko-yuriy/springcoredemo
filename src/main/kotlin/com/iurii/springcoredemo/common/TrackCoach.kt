package com.iurii.springcoredemo.common

import org.springframework.stereotype.Component

@Component
class TrackCoach : Coach {

    override fun getDailyWorkout() = "Run a hard 5k!"

}