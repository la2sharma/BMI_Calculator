// Name-Arshdeep Singh Sahota   Student Id.217590720

package com.example.bmi.BMIModelTest;
import com.example.bmi.BMIModel.BMIModel;
import org.junit.Test;

public class BMIModelTest
{
    @Test
    public void toDoubleTest()
    {
        String s;
        System.out.println("Testing toDouble:");

        s=Double.toString(Math.random());
        System.out.println(s);
        System.out.println(BMIModel.toDouble(s));

        System.out.println();
        s=Double.toString(10.0+Math.random());
        System.out.println("Second Test Case:");
        System.out.println(s);
        System.out.println(BMIModel.toDouble(s));

        System.out.println();
        s=Double.toString(15.0+Math.random());
        System.out.println("Third Test Case:");
        System.out.println(s);
        System.out.println(BMIModel.toDouble(s));
    }

    @Test
    public void getBMITest()
    {
        double w,h;
        System.out.println("Testing BMIModel:");

        w=90;h=1.8;
        System.out.println(w + "," + h);
        System.out.println(BMIModel.getBMI(w,h));

        System.out.println();
        System.out.println("Second Test Case:");
        h=0.5+2.5*Math.random();
        w=30+120*Math.random();
        System.out.println(w + "," + h);
        System.out.println(BMIModel.getBMI(w,h));

        System.out.println();
        System.out.println("Third Test Case:");
        h=0.5+2.5*Math.random();
        w=30+120*Math.random();
        System.out.println(w + "," + h);
        System.out.println(BMIModel.getBMI(w,h));


    }

    @Test
    public void formatBMITest()
    {
        double b;
        System.out.println("Testing formatBMI:");

        b=30.09877;
        System.out.println(b);
        System.out.println(BMIModel.formatBMI(b));

        System.out.println();
        System.out.println("Second Test Case:");
        b=10+Math.random();
        System.out.println(b);
        System.out.println(BMIModel.formatBMI(b));

        System.out.println();
        System.out.println("Third Test Case:");
        b=15+Math.random();
        System.out.println(b);
        System.out.println(BMIModel.formatBMI(b));


    }
}
