package com.example.task1

import kotlin.random.Random

class NumberExercise {

    var numbers: List<Int> = listOf()

    init {
        updateNumbers()
    }

    fun updateNumbers(){
        numbers = List(10){ Random.nextInt(-10,10)}
    }

    fun exerciseTwo (): Map<String,Number> {
        return mapOf("positive" to numbers.count{ it > 0 } , "negative" to numbers.filter { it < 0 }.sum())
    }

    
}