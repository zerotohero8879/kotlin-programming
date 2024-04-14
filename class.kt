package com.example.hero.practish

fun main() {
    var obj=cal()
    obj.add(40,20)
    obj.sub(40,10)

}

class cal(){
    fun add(a:Int,b:Int){
        println(a+b)
    }
    fun sub(a:Int,b:Int){
         println(a-b)
    }

}
