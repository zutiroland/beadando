package com.company;

import java.util.Scanner;

public class beadando4
{

    public static void Valogat(double[] a, double[] b)
    {
        for(int i=0;i<a.length;i++)
        {
            if (a[i]==b[i]) System.out.println(Integer.toString(i+1)+". Negyzet");
            else
            {
                if (a[i] > b[i]) System.out.println(Integer.toString(i+1) + ". Fekvo teglalap");
                else System.out.println(Integer.toString(i+1) + ". Allo teglalap");
            }
        }

    }

    public static void main(String[] args)
    {
        int szama;
        double[] a;
        double[] b;

        Scanner in = new Scanner(System.in);

        do
        {
            System.out.print("Teglalapok szama:");
            szama = in.nextInt();
            if (szama<1 || szama>10) System.out.println("A teglalapok szama 1 es 10 kozott legyen");
        }
        while (szama<1 || szama>10);

        a = new double[szama];
        b = new double[szama];

        int i=0;
        do
        {
            System.out.print("A oldal:");
            a[i] = in.nextDouble();
            System.out.print("B oldal:");
            b[i] = in.nextDouble();
            if (a[i]>0 && b[i]>0) i++;
            else System.out.println("Rossz A vagy B ertek !");
        }
        while (i<szama);

        Valogat(a, b);

    }
}
