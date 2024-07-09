package com.iurii.springcoredemo.rest

import com.iurii.springcoredemo.common.Coach
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController(
    @Qualifier("trackCoach") private val coach: Coach,
    @Qualifier("trackCoach") private val anotherCoach: Coach
) {

    @GetMapping("/dailyworkout")
    fun dailyWorkout(): ResponseEntity<String> {
        return ResponseEntity.ok(coach.getDailyWorkout())
    }

    @GetMapping("/identity")
    fun identity(): ResponseEntity<Boolean> {
        return ResponseEntity.ok(coach === anotherCoach)
    }

}