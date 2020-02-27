package com.mycompany.lab_1;

public class Point
{
    int x;
    int y;
 
    public Point()
    {
        this(0, 0);
    }
 
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public void printPoint()
    {
        System.out.println("(" + x + "," + y + ")");
    }
 
    public Point center(Point other)
    {
        return new Point((x + other.x) / 2, (y + other.y) / 2);
    }
    
    public void scale()
    {
        x /= 2;
        y /= 2;
    }
}