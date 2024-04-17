package com.example.hero.practish

fun main() {

    var obj=san()
    obj.vals()



}
//question 2 values insert kare to abhi run hoga 1 value

class san(var name:String?=null,var age:Int?=null){
    fun vals(){
        println(name)
        println(age)
    }
}



