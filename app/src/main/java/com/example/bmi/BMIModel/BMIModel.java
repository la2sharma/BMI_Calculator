// Name-Arshdeep Singh Sahota   Student Id.217590720

package com.example.bmi.BMIModel;

public class BMIModel {
    public static double toDouble(String s)
    {
        return Double.parseDouble(s);
    }

    public static double getBMI(double weight,double height)
    {
        double result = weight/(height*height);
        return result;
    }

    public static String formatBMI(double bmi)
    {
        return String.format("%.1f",bmi);
    }

    public String toPound(double weight)
    {
        String weightPounds = Double.toString(weight/0.454);
        return weightPounds;
    }


}
