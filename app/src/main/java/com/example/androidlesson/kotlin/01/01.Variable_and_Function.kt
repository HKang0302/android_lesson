package com.example.androidlesson.kotlin

/*
 01. Varialbe -> 변수
 -> 상자
    - 내 마음대로 원하는 것을 넣을 수 있는 상자: Variable
    - 한번 넣으면 바꿀 수 없는 상자: Value

 변수 선언하는 방법
 var(variable)/val(value) 변수명(상자) = 값(넣고 싶은 것)

 02. Function
 함수 선언 방법
 fun 함수명(변수명: 타입, 변수명: 타입 ...) : 반환형{
    함수내용
    return 반환값
 }
 */

var a=1+2+3+4+5
var b = "1"
var c = b.toInt()
var d = b.toFloat()
var e = "John"
var f = "My name is $e! Nice to meet you"

var abc : Int? = null

fun plus(first: Int, second: Int) : Int{
    return first+second
}

fun main(args:Array<String>){
    println(plus(a,c))
}