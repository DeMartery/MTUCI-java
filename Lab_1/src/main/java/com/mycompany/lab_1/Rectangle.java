package com.mycompany.lab_1;

public class Rectangle extends Shape
{
    // Private
    private int _size;
    
    public Rectangle(int size)
    {
        _size = size;
    }
    
    public double area()
    {
        return _size * _size;   
    }
}