public class MyTriangleTest {
    public static void main(String[] args) {

        // Create a triangle using coordinates
        MyTriangle t1 = new MyTriangle(0, 0, 3, 0, 0, 4);

        // Display the triangle
        System.out.println(t1);

        // Display the perimeter
        System.out.println("Perimeter = " + t1.getPerimeter());

        // Display the type
        System.out.println("Type = " + t1.getType());

        System.out.println();

        // Create MyPoint objects
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(2, 0);
        MyPoint p3 = new MyPoint(1, 2);

        // Create a triangle using MyPoint objects
        MyTriangle t2 = new MyTriangle(p1, p2, p3);

        System.out.println(t2);
        System.out.println("Perimeter = " + t2.getPerimeter());
        System.out.println("Type = " + t2.getType());
    }
}
