package com.mycompany.lab_1;

import java.util.Scanner;
import java.util.Vector;

public class Point
{
    public double x;
    public double y;
 
    public Point()
    {
        x = getInput("Введите абсциссу точки: ");
        y = getInput("Введите ординату точки: ");
    }
    
    public double getInput(String message)
    {
        boolean isError;
        
        do
        {
            isError = false;
            Scanner scan = new Scanner(System.in);
            System.out.print(message);
            
            if (scan.hasNextDouble())
            {
                return scan.nextDouble();
            }
            else
            {
                System.out.println("Вы ввели неверное значениие, попробуйте снова");
                isError = true;
            }
            
        } while(isError);
        
        return -1;
    }
    
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    public void move(double a, double b)
    {
        x = x + a;
        y = y + b;
    }
    
    public void set(double newX, double newY)
    {
        x = newX;
        y = newY;
    }
    
    public double length(Point p)
    {
        return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
    }
     
    public boolean equalsPoint(Point p)
    {
        if (x == p.x && y == p.y) return true;
        else return false;
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
    
    public static boolean checkCollinearity(Point p1, Point p2, Point p3)
    {
        Vector2 vector1 = new Vector2(p1, p2);
        Vector2 vector2 = new Vector2(p1, p3);
        
        vector1.normalize();
        vector2.normalize();
        
        boolean isCollinear = vector1.x == vector2.x && vector1.y == vector2.y;
        return isCollinear;
    }
    
    public void print()
    {
        System.out.println(toString());
    }
    
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
}