package com.mycompany.lab_1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rounder
{
    public static double round(double value, int accuracy)
    {
        return new BigDecimal(value).setScale(accuracy, RoundingMode.HALF_EVEN).doubleValue();
    }
}