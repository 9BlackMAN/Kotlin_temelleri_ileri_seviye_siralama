package com.ckc.kotlin_temeller_leriseviye

fun main(){

    val data = listOf<Int>(1,3,5,6,7,9,11,13,15)


    val allCheck = data.all { it<18 }  //bütün veri şartı sağlar ise çalışır
    println(allCheck)

    val anyCheck = data.any { it > 25 }  // bir tane şart ile eşleşen olsa bile true döndürür
    println(anyCheck)

    val totalCount = data.count { it > 5 } //şarta göre sağlayan sayısı verir
    println(totalCount)

    val findNum = data.find { it > 5 } //5 den büyük sayılardan en küçüğü
    println(findNum)

    val findlastNum = data.findLast {  it > 5 } //5 den büyük sayılardan en büyüğü
    println(findlastNum)



    val myPredicate = { num : Int -> num < 0 } //şartı hepsi sağlarsa şartı ayrı yazıp yapmış
    val allCheckWithPredicate = data.all(myPredicate)
    println(allCheckWithPredicate)



}