package com.example.demo.kotlinStudy

fun main() {
    val dog: Animal = Dog()
    val cat = Cat()

    cat as Dog //타입캐스 (자식 클래스 인스턴스) as (부모 클래스 인스턴스)
    if(dog is Dog) {
        println("개")
    }
}

interface Drawable {
    fun draw()
}

abstract class Animal { //abstract으로 상속의 재료가 되는 추상클래스임 명시해야함
    open fun move() { //open이 있어야 override 가능해짐
        print("이동")
    }
}

class Dog: Animal(), Drawable {
    override fun move() {
        print("멍멍")
    }

    override fun draw() {
        TODO("Not yet implemented")
    }
}

class Cat: Animal(), Drawable {
    override fun move() {
        print("먘")
    }

    override fun draw() {
        TODO("Not yet implemented")
    }
}