package com.example.hero.practish

fun main() {
    var obj=cal()
    obj.add(40,20)
    obj.sub(40,10)
    // name using ho raha hai
    var d=name()
    d.name="hero"
    d.showname("sanjeev")
    println(d.showname("sanjeev885"))


}

class cal(){
    fun add(a:Int,b:Int){
        println(a+b)
    }
    fun sub(a:Int,b:Int){
         println(a-b)
    }

}
// name use hoga

class name(){
    var name="sanjeev"
    fun showname(name:String):String{
      return name
    }
}
