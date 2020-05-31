fun main() {
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
}