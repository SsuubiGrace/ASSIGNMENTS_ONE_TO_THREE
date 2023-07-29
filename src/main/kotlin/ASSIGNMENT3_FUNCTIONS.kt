
import kotlin.math.sqrt

fun main(args: Array<String>) {
//write a function that has three parameters; two doubles and one character
//(*, +, -, /) and checks if third parameter
// == *, it will multiply the two doubles
// == +, it will add the two numbers
// == -, it will subtract the two numbers
// == /, it will divide the two numbers

    println("Enter the first number: ")
    val firstNumber = readln().toDouble()
    println("Enter the second number: ")
    val secondNumber = readln().toDouble()
    println("Enter the character +,-,*,/: ")
    val character = readln()

    myParameters(firstNumber, secondNumber, character)

}

fun myParameters(a: Double, b: Double, c:String){
//    val x=a+ b
//    print("The sum of two numbers is $x")
    val sum=a+b;
    val diff=a-b;
    val pdt=a*b;
    val quo=a/b;

    if(c=="+"){
        println("The sum of $a and $b is $sum")
    } else if(c=="-"){
        println("The difference of $a and $b is $diff")
    } else if(c=="*"){
        println("The product of $a and $b is $pdt")}
    else if(c=="/"){
        println("The quotient of $a and $b is $quo")}
    else{
        println("Enter a valid operator (+, -, *, /)!")    }
}