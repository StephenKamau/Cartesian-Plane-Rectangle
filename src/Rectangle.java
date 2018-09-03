public class Rectangle {

    private float x1, x2, x3, x4;
    private float y1, y2, y3, y4;

    //constructor
    public Rectangle(float x1, float y1, float x2, float y2,
                     float x3, float y3, float x4, float y4) {

        //sets the values
        setValues(x1, y1, x2, y2, x3, y3, x4, y4);

    }

    //set method
    public void setValues(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4) {
        if ((x1 > 0 && x1 <= 20) && (y1 > 0 && y1 <= 20)
                && (x2 > 0 && x2 <= 20)
                && (y2 > 0 && y2 <= 20)
                && (x3 > 0 && x3 <= 20)
                && (y3 > 0 && y3 <= 20)
                && (x4 > 0 && x4 <= 20)
                && (y4 > 0 && y4 <= 20)) {
            if (calculateLength(x1, y1, x4, y4) ==
                    calculateLength(x2, y2, x3, y3)) {

                //set point A
                this.x1 = x1;
                this.y1 = y1;

                //point B
                this.x2 = x2;
                this.y2 = y2;

                //point C
                this.x3 = x3;
                this.y3 = y3;

                //point D
                this.x4 = x4;
                this.y4 = y4;
            } else {
                System.out.println("This is not a rectangle!");
            }
        } else {
            System.out.println("Enter values 1-20");
        }
    }

    //calculate width
    public float calculateWidth(float x1, float y1, float x2, float y2) {
        return (float) Math.sqrt(Math.pow(Math.abs(y2 - y1), 2)
                + Math.pow(Math.abs(x2 - x1), 2));
    }

    //calculate length
    public float calculateLength(float x1, float y1, float x4, float y4) {
        return (float) Math.sqrt(Math.pow(Math.abs(y4 - y1), 2)
                + Math.pow(Math.abs(x4 - x1), 2));
    }

    //calculate perimeter
    public float perimeter() {
        return 2 * (calculateLength(this.x1, this.y1, this.x4, this.y4)
                + calculateWidth(this.x1, this.y1, this.x2, this.y2));
    }

    //calculate area
    public float area() {
        return calculateLength(this.x1, this.y1, this.x4, this.y4)
                * calculateWidth(this.x1, this.y1, this.x2, this.y2);
    }

    //checks if it is square
    public boolean isSquare() {
        if (!(x1 == 0 && y1 == 0 && x4 == 0
                && y4 == 0 && x3 == 0 && y3 == 0)) {
            if (calculateLength(x1, y1, x4, y4) ==
                    calculateWidth(x4, y4, x3, y3)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
