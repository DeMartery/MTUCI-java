package com.mycompany.lab_1;

public class Main
{
    public static void main(String[] args)
    {
        Loops();
        Methods();
        Objects();        
        Inheritance();
        Circles();
    }
    
    private static void Loops()
    {
        // Loops
        System.out.println("LOOPS");
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 200, 212, 300, 500, 322 };
        Loops.printEvenNumbers(array);
    }
    
    private static void Methods()
    {
        // Methods
        System.out.println("\nMETHODS");
        Student student = new Student("Иван", "Иванов", "Иванович");
        student.printFullName();
    }
    
    private static void Objects()
    {
        // Objects
        System.out.println("\nOBJECTS");
        Point point = new Point(8, 4);
        point.scale();
        point.printPoint();
    }
    
    private static void Inheritance()
    {
        // Inheritance
        System.out.println("\nINHERITANCE");
        Shape shape = new Rectangle(5);
        System.out.println("The area of the shape is: " + shape.area());
    }
    
    private static void Circles()
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
}