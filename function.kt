fun main() {
    add()
    var c= returns()
    println("retuen of values=$c")
    love(40,50)
    var d=ltt(70,30)
    println("ltt=$d")
    var e= defaultValues(70)
    println("default Values=$e")
    var f= interChange(20,20)
    println("Inter change:a=$f")
    println(koi(40,20))
    println(overlonging(4.4F,5.45F))


}
fun add(){ // nahi to money liya nahi to lakar diya
    // np parameter no return
    var a=10
    var b=20
    println("sum=${a+b}")


}
fun returns():Int{
    var a:Int=5
    var b:Int=10
    return a+b
}
// money diya but lakar naahi diya dhoka
fun love(a:Int,b:Int){
    println("love=${a+b}")
}
// return value of
fun ltt(a:Int,b:Int):Int{
    return a+b
}
fun defaultValues(a:Int,b:Int=10):Int{
    return a+b

}
// values is interchange vaalues
fun interChange(a:Int=10,b:Int=20):Int{
    return a+b
}
// koi  values return nahi hoga
fun koi(a:Int,B:Int){

    println(a+B)

}
//overlonging fgunction
fun overlonging(a:Int,b:Int):Int{
    return a+b
}
fun overlonging(a:Float,b:Float):Float{
    return a+b
}
fun overlonging(a:Int,b:Int,c:Int):Int{
    return a+b+c
}
