package com.company;

import java.util.Random;

public class beadando1
{

    public static int FindMax(int tomb[])
    {
        int maxIndex=-1;
        int maxValue=Integer.MIN_VALUE;

        for(int i=0;i<tomb.length;i++)
        {
            if (tomb[i]>maxValue)
            {
                maxValue=tomb[i];
                maxIndex=i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args)
    {
        Random rand = new Random();
        int tomb[] = new int[20];
        int index;

        for (int i = 0; i < tomb.length; i++)
        {
            tomb[i] = rand.nextInt(1000);
            System.out.println(Integer.toString(i) + " " + Integer.toString(tomb[i]));
        }
        index = FindMax(tomb);
        System.out.println("Legnagyobb eleme indexe: " + Integer.toString(index));
    }
}
