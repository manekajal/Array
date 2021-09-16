package org.reversearray;

public class ReverseArray {

    public static void main(String[] args)
    {
        int[] array = new int[]{1,5,8,4};

        System.out.println("Orignal Array");

        for (int i=0; i< array.length; i++)
            System.out.println(array[i] + " ");

        System.out.println("Reverse Array");
        for (int i= array.length-1;i>0;i--)
            System.out.println(array[i] + " ");
    }
}
