package com.example.demo.kotlinStudy

fun main() {
    var n = readln()!!.toInt()

    for (i in 1..n) {
        for (j in 1..i){
            print("*")
        }
        println()
    }

    println("\n--------------------------------\n")

    for(i in n downTo 1) {
        for(j in i downTo 1){
            print("*")
        }
        println()
    }

    println("\n--------------------------------\n")

    for (i in 1..n) {
        for (j in n-i downTo 1) {
            print(" ")
        }
        for (k in i*2-1 downTo 1) {
            print("*")
        }
        println()
    }
}