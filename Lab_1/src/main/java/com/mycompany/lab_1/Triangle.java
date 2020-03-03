package com.mycompany.lab_1;

public class Triangle
{
    private Point point1;
    private Point point2;
    private Point point3;
    
    public Triangle()
    {
        boolean isError;
        
        do
        {
            isError = false;
            
            System.out.println("Вершина 1");
            point1 = new Point();

            System.out.println("Вершина 2");
            point2 = new Point();

            System.out.println("Вершина 3");
            point3 = new Point();
            
            if (Point.checkCollinearity(point1, point2, point3))
            {
                isError = true;
                System.out.println("Точки коллинеарны!");
            }
        } while(isError);
    }
    
    public Triangle(Point point1, Point point2, Point point3)
    {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }
    
    public double perimeter()
    {
        double perimeter = point1.length(point2) + point2.length(point3) + point3.length(point1);
        return Rounder.round(perimeter, 3);
    }
    
    public double area()
    {
        double a = point1.length(point2);
        double b = point2.length(point3);
        double c = point3.length(point1);
        double p = (a + b + c) / 2;
        
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }
    
    public void setPoint1(double x, double y)
    {
        point1 = setPoint(point1, x, y);
    }
    
    public void setPoint2(double x, double y)
    {
        point2 = setPoint(point2, x, y);
    }
    
    public void setPoint3(double x, double y)
    {
        point3 = setPoint(point3, x, y);
    }
    
    private Point setPoint(Point point, double x, double y)
    {
        Point oldPoint = new Point(point.x, point.y);
        point.set(x, y);
        
        if (Point.checkCollinearity(point1, point2, point3))
        {
            System.out.println("Вершины должны быть неколлинеарны!");
            point = oldPoint;
        }
        
        return point;
    }
    
    public void rotate(double angle)
    {
        Point pivot = getGravityCenter();
        
        point1.rotate(pivot, angle);
        point2.rotate(pivot, angle);
        point3.rotate(pivot, angle);
    }
    
    private Point getGravityCenter()
    {
        double gravityX = (point1.x + point2.x + point3.x) / 3;
        double gravityY = (point1.y + point2.y + point3.y) / 3;
        
        return new Point(gravityX, gravityY);
    }
    
    public void print()
    {
        System.out.println(toString());
    }
    
    public String toString()
    {
        String value = point1.toString() + "; " + point2.toString() + "; " + point3.toString();
        return value;
    }
}