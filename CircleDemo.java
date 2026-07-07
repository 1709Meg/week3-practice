public class CircleDemo {
    public static void main(String args[]) {

        double myDouble = 10.5;
        int myInt = (int) myDouble;

        Circle c1 = new Circle();
        Circle c2 = new Circle(4.0);
        Circle c3 = new Circle(c2);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("Area Circle 1 = " + c1.getArea());
        System.out.println("Area Circle 2 = " + c2.getArea());
    }

}