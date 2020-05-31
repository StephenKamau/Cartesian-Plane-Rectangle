# Cartesian-Plane-Rectangle
Cartesian plane complex rectangle
###### Introductory part 
```kotlin
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
}
``` 
