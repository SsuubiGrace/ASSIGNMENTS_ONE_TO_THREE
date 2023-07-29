import kotlin.math.sqrt

fun main(args: Array<String>) {
    // 1.program that calculates the difference between the year you were born and the current year


    print("Enter your birth year: ")
    val birthYearInput = readLine()
//    val currentYear = 2023

    val birthYear = birthYearInput?.toIntOrNull()

    if (birthYear == null) {
        println("Invalid input. Please enter a valid birth year.")
    } else {
        // Assuming the current year is 2023
        val currentYear = 2023
        val age = currentYear - birthYear
        println("Your current age is $age")
    }
    //2. c2=a2+b2 If a right angled triangle has base 4cm and ht 3cm, find the
    // height of the hypotinuse of the triangle|
    val x = 4
    val y = 3
    val p = x * x + y * y
    val m = p.toDouble()
    val C = sqrt(m)

    println("The height of the hypotenuse of the right-angled triangle is $C")

}