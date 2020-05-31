class Rectangle(x1: Float, y1: Float, x2: Float, y2: Float,
                x3: Float, y3: Float, x4: Float, y4: Float) {
    private var x1 = 0f
    private var x2 = 0f
    private var x3 = 0f
    private var x4 = 0f
    private var y1 = 0f
    private var y2 = 0f
    private var y3 = 0f
    private var y4 = 0f

    //set method
    fun setValues(x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float) {
        if (x1 > 0 && x1 <= 20 && y1 > 0 && y1 <= 20
                && x2 > 0 && x2 <= 20
                && y2 > 0 && y2 <= 20
                && x3 > 0 && x3 <= 20
                && y3 > 0 && y3 <= 20
                && x4 > 0 && x4 <= 20
                && y4 > 0 && y4 <= 20) {
            if (calculateLength(x1, y1, x4, y4) ==
                    calculateLength(x2, y2, x3, y3)) {

                //set point A
                this.x1 = x1
                this.y1 = y1

                //point B
                this.x2 = x2
                this.y2 = y2

                //point C
                this.x3 = x3
                this.y3 = y3

                //point D
                this.x4 = x4
                this.y4 = y4
            } else {
                println("This is not a rectangle!")
            }
        } else {
            println("Enter values 1-20")
        }
    }

    //calculate width
    fun calculateWidth(x1: Float, y1: Float, x2: Float, y2: Float): Float {
        return Math.sqrt(Math.pow(Math.abs(y2 - y1).toDouble(), 2.0)
                + Math.pow(Math.abs(x2 - x1).toDouble(), 2.0)).toFloat()
    }

    //calculate length
    fun calculateLength(x1: Float, y1: Float, x4: Float, y4: Float): Float {
        return Math.sqrt(Math.pow(Math.abs(y4 - y1).toDouble(), 2.0)
                + Math.pow(Math.abs(x4 - x1).toDouble(), 2.0)).toFloat()
    }

    //calculate perimeter
    fun perimeter(): Float {
        return 2 * (calculateLength(x1, y1, x4, y4)
                + calculateWidth(x1, y1, x2, y2))
    }

    //calculate area
    fun area(): Float {
        return (calculateLength(x1, y1, x4, y4)
                * calculateWidth(x1, y1, x2, y2))
    }

    //checks if it is square
    val isSquare: Boolean
        get() = if (!(x1 == 0f && y1 == 0f && x4 == 0f && y4 == 0f && x3 == 0f && y3 == 0f)) {
            if (calculateLength(x1, y1, x4, y4) ==
                    calculateWidth(x4, y4, x3, y3)) {
                true
            } else {
                false
            }
        } else {
            false
        }

    //constructor
    init {

        //sets the values
        setValues(x1, y1, x2, y2, x3, y3, x4, y4)
    }
}