package com.bridgelabz;

import com.bridgelabz.com.bridgelabz.inputLineComparision;

import java.util.Scanner;

public class LineComparisonProgram
{

    public static void getInput ()
    {
        inputLineComparision line1 = new inputLineComparision();//Line1Comparison
        Scanner input = new Scanner(System.in);
        System.out.println("enter the x1,y1,x2,y2 coordinate values for line1");
        line1.setX1(input.nextInt());
        line1.setY1(input.nextInt());
        line1.setX2(input.nextInt());
        line1.setY2(input.nextInt());
        System.out.println(" x1 is =" + line1.getX1() + " x2 is = " + line1.getX2() + " y1 = " + line1.getY1() + " y2 = " + line1.getY2());

        inputLineComparision line2 = new inputLineComparision(); //Line2 Comparison
        System.out.println("enter the x1,y1,x2,y2 coordinate values for line2");
        line2.setX1(input.nextInt());
        line2.setY1(input.nextInt());
        line2.setX2(input.nextInt());
        line2.setY2(input.nextInt());
        System.out.println(" x1 is =" + line2.getX1() + " x2 is = " + line2.getX2() + " y1 = " + line2.getY1() + " y2 = " + line2.getY2());
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to Line-Comparison Program using OOPS ");
            getInput();
    }
}