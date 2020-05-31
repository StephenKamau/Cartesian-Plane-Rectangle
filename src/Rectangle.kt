import kotlin.math.*

class Rectangle() {
    private var firstCoordinate = IntArray(2) { 0 }
    private var secondCoordinate = IntArray(2) { 0 }
    private var thirdCoordinate = IntArray(2) { 0 }
    private var fourthCoordinate = IntArray(2) { 0 }
    private fun calculateDistance(fromCoordinate: IntArray, toCoordinate: IntArray): Int {
        //use pythagoras theorem to get the distance between two points on a cartesian plane
        val a = abs(toCoordinate[1] - fromCoordinate[1]).toDouble()
        val b = abs(toCoordinate[0] - fromCoordinate[0]).toDouble()
        return sqrt(a.pow(2.0)
                + b.pow(2.0)).toInt()
    }

    fun assignCoordinates(firstCoordinate: IntArray, secondCoordinate: IntArray,
                          thirdCoordinate: IntArray, fourthCoordinate: IntArray) {
        val yDistance = calculateDistance(firstCoordinate, secondCoordinate)
        val xDistance = calculateDistance(thirdCoordinate, fourthCoordinate)
        if (yDistance == xDistance) {
            this.firstCoordinate = firstCoordinate
            this.secondCoordinate = secondCoordinate
            this.thirdCoordinate = thirdCoordinate
            this.fourthCoordinate = fourthCoordinate
        } else {
            println("Length not equal:\n" +
                    "[Point(${firstCoordinate[0]},${firstCoordinate[1]})] and [Point(${secondCoordinate[0]},${secondCoordinate[1]})]" +
                    " = $xDistance\n" +
                    "[Point(${thirdCoordinate[0]},${thirdCoordinate[1]})] and [Point(${fourthCoordinate[0]},${fourthCoordinate[1]})]" +
                    " = $yDistance")
        }
    }

    fun getPerimeter(): Int = 2 * (calculateDistance(firstCoordinate, secondCoordinate) +
            calculateDistance(secondCoordinate, thirdCoordinate))

    fun getArea(): Int = calculateDistance(firstCoordinate, secondCoordinate) *
            calculateDistance(secondCoordinate, thirdCoordinate)

    fun isSquare(): Boolean = calculateDistance(firstCoordinate, secondCoordinate) ==
            calculateDistance(secondCoordinate, thirdCoordinate)
}