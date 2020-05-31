object TestRectangle {
    @JvmStatic
    fun main(args: Array<String>) {

        //point A
        val x1 = 1f
        val y1 = 1f

        //point B
        val x2 = 1f
        val y2 = 4f

        //point C
        val x3 = 5f
        val y3 = 4f

        //point D
        val x4 = 5f
        val y4 = 1f

        /** Enable in order to enter the values
         * Scanner input = new Scanner(System.in);
         * System.out.println("Point A: ");
         * System.out.print("Enter x: ");
         * x1 = input.nextFloat();
         * System.out.print("Enter y: ");
         * y1 = input.nextFloat();
         *
         * System.out.println();
         *
         * System.out.println("Point B: ");
         * System.out.print("Enter x: ");
         * x2 = input.nextFloat();
         * System.out.print("Enter y: ");
         * y2 = input.nextFloat();
         *
         * System.out.println();
         *
         * System.out.println("Point C: ");
         * System.out.print("Enter x: ");
         * x3 = input.nextFloat();
         * System.out.print("Enter y: ");
         * y3 = input.nextFloat();
         *
         * System.out.println();
         *
         * System.out.println("Point D: ");
         * System.out.print("Enter x: ");
         * x4 = input.nextFloat();
         * System.out.print("Enter y: ");
         * y4 = input.nextFloat(); */
        val rectangle1 = Rectangle(x1, y1, x2, y2, x3, y3, x4, y4)
        val area: Float = rectangle1.area()
        val perimeter: Float = rectangle1.perimeter()
        val isSquare = rectangle1.isSquare()
        val length: Float = rectangle1.calculateLength(x1, y1, x4, y4)
        val width: Float = rectangle1.calculateWidth(x1, y1, x2, y2)
        println("Length: $length\nWidth: $width")
        println("Area: $area\nPerimeter: $perimeter\nSquare? $isSquare")
    }
}