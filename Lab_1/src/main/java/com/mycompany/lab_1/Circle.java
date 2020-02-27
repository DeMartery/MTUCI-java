package com.mycompany.lab_1;

import java.util.Random;

public class Circle
{
    // Private
    private int x;
    private int y;
    private double radius;
    
    public Circle(int x, int y, int radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    public double getLength()
    {
        return 2 * radius * Math.PI;                
    }
    
    public void transfer()
    {
        x = getRandomCoordinate();
        y = getRandomCoordinate();
    }
    
    private int getRandomCoordinate()
    {
        int minBound = -99;
        int maxBound = 99;
        
        Random random = new Random();
        return random.nextInt((maxBound - minBound) + 1) + minBound;
    }
    
    public double getDistance(Circle circle)
    {
        double xDifference = Math.pow(circle.x - x, 2);
        double yDifference = Math.pow(circle.y - y, 2);
        
        return Math.sqrt(xDifference + yDifference);
    }
    
    public boolean touchWith(Circle circle)
    {
        double distance = getDistance(circle);
        return distance == radius + circle.radius || distance == Math.abs(radius -  circle.radius);
    }
    
    public void printCircle()
    {
        System.out.println("(" + x + "; " + y + "; " + radius + ")");
    } 
}