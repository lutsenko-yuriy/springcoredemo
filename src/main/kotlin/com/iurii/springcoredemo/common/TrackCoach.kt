package com.iurii.springcoredemo.common

import jakarta.annotation.PostConstruct
import jakarta.annotation.PreDestroy
import org.springframework.stereotype.Component

@Component
class TrackCoach : Coach {

    init {
        println("Track Coach init")
    }

    @PostConstruct
    fun init() {
        println("Init some stuff in @PostConstruct method")
    }

    @PreDestroy
    fun onDestroy() {
        println("In @PreDestroy method. The bean is about to be destroyed.")
    }

    override fun getDailyWorkout() = "Run a hard 5k!"

}