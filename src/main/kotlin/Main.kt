fun main() {

    val numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
    sumOfSecondAndFifth(numbers)
    val persons = listOf(
        Person("Mary", 40, 170, 64),
        Person("Carol", 30, 180, 80),
        Person("Cathy", 22, 165, 55),
        Person("Billy", 35, 175, 75)
    )

    val sortedPersons = persons.sortedByDescending { it.age }

    println(sortedPersons)

    val namesArray = combineNames("Mary", "Cathy", "Billy")
    println(namesArray.contentToString())

    val cars = listOf(
        Car("KAK 815B", 1000),
        Car("KDK 715K", 1500),
        Car("KDL 469D", 1200)
    )
    println("Average mileage: ${averageMileage(cars)}")


}

//Lists assignment1. Create one function that given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order. (1 point)
fun sumOfSecondAndFifth(numbers: Array<Int>) {
    val sum = numbers[1] + numbers[4]
    println("Sum of second and fifth elements: $sum")
    val index = numbers.indexOf(158)
    println(index)
    val sortedNumbers = numbers.sorted()
    println("Ascending order of elements: $sortedNumbers")
}
//2. Given a list of Person objects, each with the attributes, name, age, height, and
// weight. Sort the list in order of descending age (2 points)
data class Person(val name: String, val age: Int, val height: Int, val weight: Int)

//
//3. Create a function that takes in 3 names and returns a string array
// containing all 3 names. (2 points)
fun combineNames(name1: String, name2: String, name3: String): Array<String> {
    val names = arrayOf(name1, name2, name3)
    return names
}

//
//4. Write a function that takes in a list of Car objects each with a registration
// and mileage attribute and returns the average mileage of all the vehicles in the list. (3 points)
data class Car(val registration: String, val mileage: Int)

fun averageMileage(cars: List<Car>): Double {
    var totalMileage = 0
    for (car in cars) {
        totalMileage += car.mileage
    }
    return totalMileage.toDouble() / cars.size
}

