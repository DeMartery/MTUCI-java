package com.mycompany.lab_1;

public class Vector2
{
    public double x;
    public double y;
    
    public Vector2()
    {
        this.x = 0.0;
        this.y = 0.0;
    }
       
    public Vector2(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    public Vector2(Point p1, Point p2)
    {
        this.x = p2.x - p1.x;
        this.y = p2.y - p1.y;
    }
    
    public void normalize()
    {
        double length = length();
        
        x /= length;
        y /= length;
    }
    
    public double length()
    {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}