package com.iurii.springcoredemo.config

import com.iurii.springcoredemo.common.Coach
import com.iurii.springcoredemo.common.SwimCoach
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Configuration {

    @Bean("aquatic")
    fun coach(): Coach = SwimCoach()

}