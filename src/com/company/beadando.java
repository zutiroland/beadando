package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class beadando {

    private static double[] aoldal;
    private static double[] boldal;
    private static double[] terulet;

    private static int[] teruletindex;

    /* public static int FindMax(int a[]) {
        int maxIndex=-1;
        int maxValue=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){
            if (a[i]>maxValue) {
                maxValue=a[i];
                maxIndex=i;
            }
        }
        return maxIndex;
    }
    */

    public static boolean Rect(double a, double b) {
        return  b>=a;
    }

    public static boolean Rect_3(double a, double b) {
        String allasa;
        boolean allo = Rect(a,b);

        //allasa = allo ? "Allo" : "Fekvo";
        if (allo) allasa="Allo"; else allasa="Fekvo";

        System.out.println("A oldal="+Double.toString(a)
                +" B oldal="+Double.toString(b)
                +" allasa="+allasa);
        return allo;
    }

    public static void SzetValogat(double[] aoldal, double[] boldal)
    {
        for(int i=0;i<aoldal.length;i++)
        {
            if (aoldal[i]==boldal[i]) System.out.println(Integer.toString(i)+". negyzet");
            else {
                if (aoldal[i] > boldal[i]) System.out.println(Integer.toString(i) + ". fekvo teglalap");
                else System.out.println(Integer.toString(i) + ". allo teglalap");
            }
        }

    }

    public static int Negyzetek(double[] aoldal, double[] boldal)
    {
        int n=0;
        for(int i=0;i<aoldal.length;i++) if (aoldal[i]==boldal[i]) n++;
        System.out.println("Negyzetek szama: "+Integer.toString(n));
        return n;
    }

    public static void csokkenoSorban(double[] tomb, int[] teruletindex) {
        double csere;
        int t;
        int max;
        for (int i = 0; i < tomb.length - 1; i++) {
            max = i;
            for (int j = i + 1; j < tomb.length; j++) {
                if (tomb[j] > tomb[max]) {
                    max = j;
                }
            }
            if (max != i) {

                csere = tomb[i];
                tomb[i] = tomb[max];
                tomb[max] = csere;

                t=teruletindex[i];
                teruletindex[i]=teruletindex[max];
                teruletindex[max]=t;
            }
        }
        System.out.println(Arrays.toString(tomb));
        System.out.println(Arrays.toString(teruletindex));
    }

    public static void main(String[] args) {
        int tsz;

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Teglalapok szama:");
            tsz = in.nextInt();
            if (tsz<1 || tsz>100) System.out.println("A tegalalpok szama 1 es 100 koze essen");
        } while (tsz<1 || tsz>100);

        aoldal = new double[tsz];
        boldal = new double[tsz];

        int i=0;
        do {
            System.out.print("A oldal:");
            aoldal[i] = in.nextDouble();
            System.out.print("B oldal:");
            boldal[i] = in.nextDouble();
            if (aoldal[i]>0 && boldal[i]>0) i++;
            else System.out.println("Rossz az A vagy a B ertek!");
        } while (i<tsz);

        //SzetValogat(aoldal, boldal);
        //Negyzetek(aoldal,boldal);

        // terulet atlag
        double tsum=0;
        terulet = new double[tsz];
        teruletindex = new int[tsz];
        for(i=0;i<tsz;i++) {
            terulet[i]=aoldal[i]*boldal[i];
            tsum = tsum +terulet[i];
            teruletindex[i]=i;
        }
        System.out.println("Terulet atlag: " + Double.toString(tsum/(double) tsz) );

        csokkenoSorban(terulet,teruletindex);

     /*
        Random rand = new Random();
        int a[] = new int[10];
        int mi;

        for(int i=0;i<a.length;i++) {
            a[i] = rand.nextInt(1000);
            System.out.println(Integer.toString(i)+" "+Integer.toString(a[i]));
        }
        mi=FindMax(a);
        System.out.println("Max index: "+Integer.toString(mi));
        */

        /*double a,b;
        Scanner in = new Scanner(System.in);
        System.out.print("A oldal:");
        a = in.nextDouble();
        System.out.print("B oldal:");
        b = in.nextDouble();*/

        /*
        if (Rect(a,b)) System.out.println("Allo teglalap");
        else System.out.println("Fekvo teglalap");
        */
        //Rect_3(a,b);

    }
}
