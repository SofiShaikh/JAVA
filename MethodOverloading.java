class area {
    int area(int side) {
        return side * side;
    }

    int area(int length, int breadth) {
        return length * breadth;
    }

    double area(double radius) {
        return 3.14 * radius * radius;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        area a = new area();

        System.out.println("Area of square: " + a.area(5));
        System.out.println("Area of rectangle: " + a.area(5, 10));
        System.out.println("Area of circle: " + a.area(7.5));
    }
}
