import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val firstCoordinate = intArrayOf(9, 24)
    val secondCoordinate = intArrayOf(9, 6)
    val thirdCoordinate = intArrayOf(27, 6)
    val fourthCoordinate = intArrayOf(27, 24)
    val rectangle = Rectangle()
    rectangle.assignCoordinates(firstCoordinate, secondCoordinate,
            thirdCoordinate, fourthCoordinate)
    println(if (rectangle.isSquare()) "Square" else "Rectangle")
    println("Perimeter = ${rectangle.getPerimeter()}")
    println("Area = ${rectangle.getArea()}")
    //handle input
    val rectangleTwo = Rectangle()
    println("Enter the 4 coordinates: (x y)")
    val pointA = IntArray(2) { scanner.nextInt() }
    val pointB = IntArray(2) { scanner.nextInt() }
    val pointC = IntArray(2) { scanner.nextInt() }
    val pointD = IntArray(2) { scanner.nextInt() }
    rectangleTwo.assignCoordinates(pointA, pointB, pointC, pointD)
    println(if (rectangleTwo.isSquare()) "Square" else "Rectangle")
    println("Perimeter = ${rectangleTwo.getPerimeter()}")
    println("Area = ${rectangleTwo.getArea()}")
}