package com.iurii.springcoredemo.common

import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

@Primary
@Component
class TrackCoach : Coach {

    override fun getDailyWorkout() = "Run a hard 5k!"

}