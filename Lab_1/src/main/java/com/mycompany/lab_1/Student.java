package com.mycompany.lab_1;

public class Student
{
    public String firstName;
    public String secondName;
    public String thirdName;
    
    public Student(String firstName, String secondName, String thirdName)
    {
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
    }
    
    public void printFullName()
    {
        System.out.println(secondName + " " + firstName + " " + thirdName);
    }
}