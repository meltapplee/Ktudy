package com.example.demo.kotlinStudy

fun main() {
    val koko = Person("eunchong", 17)
    print(koko.name)
}

class Person(val name: String, val age: Int)