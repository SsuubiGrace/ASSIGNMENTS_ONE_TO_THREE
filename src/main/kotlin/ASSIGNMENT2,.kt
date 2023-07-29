import kotlin.math.sqrt

fun main(args: Array<String>) {

    //ASSIGNMENT2
// QUESTION1. Solve the equation x2+10x+25 = 0  - x = (-b+-Sqrt(b2-4ac))/2a

// Coefficients of the quadratic equation
    val p = 1.0
    val q = 10.0
    val r = 25.0
    // Calculate the discriminant (b^2 - 4ac)
    val discriminant = q * q - 4 * p * r
    val x1 = (-q + sqrt(discriminant)) / (2 * p)
    val x2 = (-q - sqrt(discriminant)) / (2 * p)
    println("Two real and distinct solutions:")
    println("x1 = $x1")
    println("x2 = $x2")

    //QUESTION2
//    A car is moving at a speed of 1000m/s at an acceleration of 25m/s/s
//            Find the time it will take to move a distance of 5km
//    Hint - acceleration = speed/time
//    speed = distance/time

    /*speed=1000
  //    acceleration -25m/s/s
  //    distance-5km
  //    time=?
  //    speed=d/T
  //    T=d/s
  //    * */
    val speed =1000
    val distance = 5 * 1000
    val time= distance/speed
    print("The time it will take is $time")



//QUESTION3


    // 3. A person has four option of choosing between;
//    pizza, chicken, pancakes or cake. If they choose pizza, they'll go to pizza hut,
//    if chicken, they'll go to kfc, if pancakes, they'll go to foodhub,
//    if cake, they'll go to cakely. Write
//    -a program using an if statement that captures the persons choice and prints the
//    selected restaurant
//            -same program using a when statement

    //using if statement
    println("Enter your option")
    val food=readln()
    if(food=="pizza"){
        println("go to pizza hut")
    } else if(food=="chicken"){
        println("go to kfc")
    } else if(food=="pancakes"){
        println("go to foodhub")}
    else if(food=="cake"){
        println("go to cakely")}
    else{
        println("Try elsewhere!!!!!!!!!1")
    }

//USING WHEN STATEMENT
    println("Enter your option")
    val fd=readln()
    when(fd){
        "pizza" -> print("go to pizza hut")
        "chicken" -> print("Go to KFC")
        "pancakes" -> print("Go to foodhub")
        "cake" -> print("Go to cakely")
        else -> println("Try elsewhere")
    }

//QUESTION4
// Solve the equation x3+7x2+10x = 0
    //ans -2 -r -5 x(x2 =7x +10)
    val a = 1.0
    val b = 7.0
    val c = 10.0

    val discriminan = b * b - 4 * a * c

    if (discriminan > 0) {
        val root1 = (-b + sqrt(discriminan)) / (2 * a)
        val root2 = (-b - sqrt(discriminan)) / (2 * a)
        println("Roots of the equation are: $root1 and $root2")
    } else if (discriminan == 0.0) {
    } else if (discriminan == 0.0) {
        val root = -b / (2 * a)
        println("The equation has a single root: $root")
    } else {
        println("The equation has no real roots.")
    }

    //QUESTION5

    // 5. A person is moving to his village with a car moving at 20km/h and He has many
//            alternative routes.
//    If he uses route1, he'll move a distance of 5000km
//    If he uses route2, he'll move a distance of 25000km
//    If he uses route3, he'll move a distance of 50000km
//    If he uses another, he'll move a distance of 10000km
//
//    Find the time it will take him to reach the village using the separate routes
//    -using an if statement
//    -using a when statement

    //SUING IF STATEMENT
    println("Enter the route")
    val route=readln()
    if(route=="route1"){
        println("you will move a distance of 5000km")
    } else if(route=="route2"){
        println("you will move a distance of 25000km")
    } else if(route=="route3"){
        println("you will move a distance of 50000km")}
    else{
        println("You will he'll move a distance of 10000km")
    }

    //USING WHEN STATEMENT
    println("Enter the route")
    val rout=readln()
    when(rout){
        "route1" -> print("you will move a distance of 5000km")
        "route2" -> print("you will move a distance of 25000km")
        "route3" -> print("you will move a distance of 50000km")
        else -> println("You will he'll move a distance of 10000km")
    }

}