package org.arrayposition;

public class ArrayOddPosition {
    public static void main(String[] args)
    {
        int[] array = new int[]{ 2,5,8,9,10};
        System.out.println("Elements of given array present on even position: ");

        for (int i=0; i< array.length;i=i+2)
        {
            System.out.println(array[i]);
        }
    }
}
