class Shape {
    void draw() {
        // Default draw method
    }

    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Cylinder extends Circle {
    double height;

    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Cylinder");
    }

    double calculateArea() {
        // Surface area of a cylinder: 2πr(r + h)
        return 2 * Math.PI * radius * (radius + height);
    }
}

class ShapeSuper {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        circle.draw();
        System.out.println("Circle Area: " + circle.calculateArea(circle.radius));

        Cylinder cylinder = new Cylinder(5, 10);
        cylinder.draw();
        System.out.println("Cylinder Surface Area: " + cylinder.calculateArea());
    }
}
