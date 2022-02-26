fun main() {
    var campus = "akirachix"
    var char1 = campus[0]
    var char3 = campus[2]
    var char4 = campus[3]
    var result = "$char1$char3$char4"
    println(result)
    var salim = parameters("Naima","21")
    println(salim)
    var String = "Mima"
    println("the length of my name is " + String.length)
    var name = "Naima"
    if(name=="Naima")
        println("thats me")
    else{
        println("thats not me")
    }
}
fun parameters(name:String, age:String):String {
    var me = "Hi, my name is $name and i am $age years old"
    return me

}


