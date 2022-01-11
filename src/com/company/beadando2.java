package com.company;

import java.util.Scanner;

public class beadando2
{

    public static boolean Feltetel(double a, double b)
    {
        return  b>=a;
    }

    public static void main(String[] args)
    {
        double a, b;
        Scanner in = new Scanner(System.in);
        System.out.print("A oldal:");
        a = in.nextDouble();
        System.out.print("B oldal:");
        b = in.nextDouble();

        if (Feltetel(a, b)) System.out.println("True - Allo teglalap");
        else System.out.println("False - Fekvo teglalap");
    }

}


