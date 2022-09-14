/*
fun main(){
    print("Hello World!")
}
*/

/*
fun main() {


    val numberOfFish = 50
    val numberOfPlants = 23
    if (numberOfFish > numberOfPlants) {
        println("Good ratio!")
    } else {
        println("Unhealthy ratio")
    }
}*/


/*
fun main(){
val numberOfFish = 50
    val numberOfPlants = 23
 val fish = 50
if (fish in 1..100) {
    println(fish)
}
}
 */

/*

fun main(){
val numberOfFish = 50
    val numberOfPlants = 23
 if (numberOfFish == 0) {
    println("Empty tank")
} else if (numberOfFish < 40) {
    println("Got fish!")
} else {
    println("That's a lot of fish!")
}
}
 */

/*
fun main(){
    val numberOfFish = 50
    val numberOfPlants = 23
    when (numberOfFish) {
        0  -> println("Empty tank")
        in 1..39 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }
}

 */


/*
fun main(){
    val school = listOf("mackerel", "trout", "halibut")
    println(school)
}

 */
/*
fun main(){
    val school = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(school))
}
*/
/*
fun main(){
    val numbers = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers
    println(foo2[5])
}
*/
/*
fun main(){
    val numbers = intArrayOf(1, 2, 3)
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers, oceans, "salmon")
    println(oddList)
}

 */

/*
fun main(){
    val array = Array (5) { it * 2 }
    println(java.util.Arrays.toString(array))
}
 */
/*
fun main(){
    val school = arrayOf("shark", "salmon", "minnow")
    for (element in school) {
        print(element + " ")
    }
}
 */
/*
fun main(){
    for ((index, element) in school.withIndex()) {
        println("Item at $index is $element\n")
    }
}
*/

fun main(){
    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in the water\n")

    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubbles in the water\n")

    repeat(2) {
        println("A fish is swimming")
    }
}