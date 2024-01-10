package com.example.demo.kotlinStudy

fun main() {
    val peter = Person("Peter", 17)
    val peter2 = Person("Peter", 17)
    println(peter.name)

    println(peter == peter2)
    println(peter.hobby)


}
class Person(val name: String, val age: Int) {
    var hobby = "배구"
        private set // 외부에서 변경이 불가능하도록
        get() = "취미: $field"
    init {
        println("여따 기본 생성자 이외에 추가적으로 하고싶은거 적으면 됩니다")
        println("그럼 클래스 돌릴때마다 실행됩니다")
    }

    fun someM() {
        hobby = "수영"
    }
}
//이렇게 하고 peter랑 peter2 비교하면 false 뜬다 -> 해시값이 다르니까

//data class Person(val name: String, val age: Int)
//data를 붙이면 해시 값이 달라도 같은걸로 쳐준다~
//data 클래스라고 한다
//기능이 있으면 뒤에 {}열고 함수 만들면 됨