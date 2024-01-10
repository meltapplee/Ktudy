package com.example.demo.kotlinStudy

fun main(){
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    print(sum(a, b))
}

fun sum(a: Int, b: Int): Int{ //fun 함수명(매개변수): return타입
    return a+b
}
//fun sum(a: Int, b: Int) = a+b //안에 내용이 ㅎ한줄밖에 없을 경우 이렇게 작성 가능
