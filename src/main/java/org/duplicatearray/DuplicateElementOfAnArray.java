package org.duplicatearray;

public class DuplicateElementOfAnArray {

    public static void main(String[] args)
    {
        int[] array = new int[]{1,3,5,7,2,3,6,};

        System.out.println("Duplicate Element of an Array");

        for (int i=0; i< array.length;i++)
            for (int j=i+1;j< array.length;j++)
                if(array[i]==array[j])
                    System.out.println(array[j] + " ");
    }
}
