package com.example.hero.practish

fun main() {
    var obj=cons("hero",45)
    obj.nameshow()

}
class cons{
    var name:String?=null
    var age:Int?=null

    constructor( name:String, age:Int){
        this.name=name
        this.age=age

    }
    constructor(name:String)
        fun nameshow(){
            println(name)
            println(age)
        }


}



