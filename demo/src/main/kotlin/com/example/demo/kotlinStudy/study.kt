package com.example.demo.kotlinStudy


fun main() {
    var name: String? = null
    name = "박수현"
    //name = null

    var name2: String = ""

    name?.let {
        name2 = name
        print("${name2}은 null 이 아니잖아??")
    }
}