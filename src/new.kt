fun main() {
    word("AkiraChix")
    salutation("Charity", 2)
   var word= count("Charity")
    println(word)
    recognize("Charity")

}
//function that print out the first, third and fourth characters
fun word(name:String){
    var name="AkiraChix"
    var newName=name[0].toString() + name[2] +name[3]
    println(newName)
}
//function that takes in two parameter and return "hi, my name is x and i am y years old
fun salutation(name:String, age:Int){
    var statement= "Hi, my name is $name and I am $age years old."
    println(statement)
}
//function that prints out the length of a string
fun count(name:String):Int {
    var word = name.length
    return word
}
fun recognize(name:String){
    if(name=="Charity")
        println("That's me")
    else
        println("I don't know who that is")
}

