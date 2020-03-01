package com.mycompany.lab_1;

public class Main
{
    public static void main(String[] args)
    {
        loops();
        methods();
        objects();        
        inheritance();
        circles();
        triangles();
    }
    
    private static void loops()
    {
        // Loops
        System.out.println("LOOPS");
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 200, 212, 300, 500, 322 };
        Loops.printEvenNumbers(array);
    }
    
    private static void methods()
    {
        // Methods
        System.out.println("\nMETHODS");
        Student student = new Student("Иван", "Иванов", "Иванович");
        student.printFullName();
    }
    
    private static void objects()
    {
        // Objects
        System.out.println("\nOBJECTS");
        Point point = new Point(8, 4);
        point.scale();
        point.print();
    }
    
    private static void inheritance()
    {
        // Inheritance
        System.out.println("\nINHERITANCE");
        Shape shape = new Rectangle(5);
        System.out.println("The area of the shape is: " + shape.area());
    }
    
    private static void circles()
    {
        // Circles
        System.out.println("\nCIRCLES");
        Circle circle1 = new Circle(0, 0, 3);
        circle1.printCircle();
        Circle circle2 = new Circle(0, 0, 1);
        circle2.printCircle();
        
        System.out.println("Circle 1 lenght = " + circle1.getLength());
        
        circle2.transfer();
        circle2.printCircle();
        
        System.out.println("Distance = " + circle1.getDistance(circle2));
        System.out.println("Is touching = " + circle1.touchWith(circle2));
    }
    
    private static void triangles()
    {
        // Triangles
        System.out.println("\nTRIANGLES");
        Triangle triangle = new Triangle();
        
        triangle.print();
        System.out.println("Perimeter = " + triangle.perimeter());
        System.out.println("Area = " + triangle.area());
        
        triangle.setPoint1(10, 0);
    }
}