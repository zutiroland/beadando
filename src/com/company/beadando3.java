package com.company;

import java.util.Scanner;

public class beadando3
{
    public static boolean Feltetel(double a, double b)
    {
        return  b>=a;
    }

    public static boolean Vizsgalat(double a, double b)
    {
        String allasa;
        boolean allo = Feltetel(a,b);

        if (allo) allasa="Allo"; else allasa="Fekvo";

        System.out.println("A oldal="+Double.toString(a)
                +" B oldal="+Double.toString(b)
                +" " +allasa);
        return allo;
    }

    public static void main(String[] args)
    {
        double a, b;
        Scanner in = new Scanner(System.in);
        System.out.print("A oldal:");
        a = in.nextDouble();
        System.out.print("B oldal:");
        b = in.nextDouble();

        Vizsgalat(a, b) ;
    }

}
