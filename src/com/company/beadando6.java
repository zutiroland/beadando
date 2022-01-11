package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class beadando6
{

    private static double[] a;
    private static double[] b;
    private static double[] terulet;

    private static int[] teruletindex;

    public static int Negyzet(double[] a, double[] b)
    {
        int n=0;
        for(int i=0;i<a.length;i++) if (a[i]==b[i]) n++;
        System.out.println("Negyzetek szama: "+Integer.toString(n));
        return n;
    }

    public static void Novekvo(double[] tomb, int[] teruletindex)
    {
        double csere;
        int t;
        int min;
        for (int i = 0; i < tomb.length - 1; i++)
        {
            min = i;
            for (int j = i + 1; j < tomb.length; j++)
            {
                if (tomb[j] < tomb[min])
                {
                    min = j;
                }
            }
            if (min!= i)
            {
                csere = tomb[i];
                tomb[i] = tomb[min];
                tomb[min] = csere;

                t=teruletindex[i];
                teruletindex[i]=teruletindex[min];
                teruletindex[min]=t;
            }
        }
        System.out.println("Teglalapok teruletei sorban rendezve : "+ Arrays.toString(tomb));
    }
    public static void main(String[] args)
    {
        //Teglalapok szamanak ellenorzese
        int szama;
        Scanner in = new Scanner(System.in);
        do
        {
            System.out.print("Teglalapok szama:");
            szama = in.nextInt();
            if (szama < 1 || szama > 10) System.out.println("A teglalapok szama 1 es 10 kozott legyen");
        }
        while (szama < 1 || szama > 10);

        a = new double[szama];
        b = new double[szama];

        int i = 0;
        do
        {
            System.out.print("A oldal:");
            a[i] = in.nextDouble();
            System.out.print("B oldal:");
            b[i] = in.nextDouble();

            if (a[i] > 0 && b[i] > 0) i++;
            else System.out.println("Rossz az A vagy a B ertek!");
        }
        while (i < szama);

        //Terulet szamitasa
        double tsum = 0;
        double maxTerulet=0;
        int maxTeruletIndex=0;
        terulet = new double[szama];
        teruletindex = new int[szama];
        for (i = 0; i < szama; i++) {
            terulet[i] = a[i] * b[i];
            tsum = tsum + terulet[i];
            teruletindex[i] = i;
            if (terulet[i]>maxTerulet) {
                maxTerulet=terulet[i];
                maxTeruletIndex=i;
            }
        }

        System.out.println("Osszes Terulet : " + Double.toString(tsum));

        System.out.println("Legnagyobb terulet : " +
                " A oldal = "+ Double.toString(a[maxTeruletIndex])+
                " , B oldal = "+ Double.toString(b[maxTeruletIndex])+
                " , Terulet = "+ Double.toString(maxTerulet));

        Negyzet(a,b);

        Novekvo(terulet, teruletindex);
        for (i = 0; i < szama; i++)
        {
            for(int j=0;j<szama;j++)
            {
                if (teruletindex[j]==i)
                    System.out.println("Terulet index: "+Integer.toString(i)+ " Eredeti index: "+ Integer.toString(teruletindex[i])+" T="+terulet[i]);
            }
        }

        for (i = 0; i < szama; i++)
        {
            if (a[i]<b[i])
            System.out.println("Allo: A oldal="+ Double.toString(a[maxTeruletIndex])+
                    " , B oldal="+ Double.toString(b[maxTeruletIndex]));
        }

        for (i = 0; i < szama; i++)
        {
            if (a[i]>b[i])
            System.out.println("Fekvo: A oldal="+ Double.toString(a[maxTeruletIndex])+
                    " , B oldal="+ Double.toString(b[maxTeruletIndex]));
        }

        for (i = 0; i < szama; i++)
        {
            if (a[i]==b[i])
            System.out.println("Negyzet: A oldal="+ Double.toString(a[maxTeruletIndex])+
                    " , B oldal="+ Double.toString(b[maxTeruletIndex]));
        }

    }
}
