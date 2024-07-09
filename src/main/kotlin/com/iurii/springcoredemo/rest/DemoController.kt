package com.iurii.springcoredemo.rest

import com.iurii.springcoredemo.common.Coach
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {

    @set:Autowired
    var coach: Coach? = null

    @GetMapping("/dailyworkout")
    fun dailyWorkout(): ResponseEntity<String> {
        return ResponseEntity.ok(coach?.getDailyWorkout())
    }
}