package com.mycompany.lab_1;

public class Loops
{
    public static void printEvenNumbers(int[] numbers)
    {
        int maxNumber = 237;
        
        for (int i = 0; i < numbers.length; i++)
        {
            int number = numbers[i];
            
            if (number > maxNumber)
            {
                break;
            }
            
            if (number % 2 == 0)
            {
                System.out.println(number);
            }
        }
    }
}