package daysOfCode

import java.util.*

data class Person(var initialAge: Int) {
    private var age = 0

    fun checkValidAge() {
        if(initialAge >= 0){
            age = initialAge
        }
        else{
            age = 0
            println("Age is not valid, setting age to 0")
        }
    }

    fun amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        if(age < 13){
            println("You are young.")
        }
        else if(age in 13..17){
            println("You are a teenager.")
        }
        else{
            println("You are old.")
        }
    }

    fun yearPasses() {
        // Increment this person's age.
        age += 1
    }
}

fun main() {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()
    val person = Person(0)

    for (i in 0 until t) {
        val age = sc.nextInt()
        person.initialAge = age
        person.checkValidAge()

        person.amIOld()
        for (j in 0..2) {
            person.yearPasses()
        }
        person.amIOld()
        println()
    }
}