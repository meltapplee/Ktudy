package com.example.demo.kotlinStudy

fun main(){
    val box = Box(10) //타입추론이라 <Int> 생략 가능
    val box2 = Box("슈뢰딩거's 고양이")

    println(box.value)
}

class Box<T>(val value: T)