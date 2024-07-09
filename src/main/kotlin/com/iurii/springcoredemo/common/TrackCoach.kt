package com.iurii.springcoredemo.common

import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class TrackCoach : Coach {

    init {
        println("Track Coach init")
    }

    override fun getDailyWorkout() = "Run a hard 5k!"

}