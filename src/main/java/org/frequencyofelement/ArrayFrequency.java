package org.frequencyofelement;

public class ArrayFrequency {

    public static void main(String[] args)
    {
        int[] array = new int[]{1,2,3,9,2,0,8,8};
        int[] frequency= new int[array.length];

        int visited=-1;
         for(int i=0;i< array.length;i++)
         {
             int count=1;
                   for(int j = i+1; j < array.length; j++){
                     if(array[i] == array[j]){
                         count++;
                         //To avoid counting same element again
                         frequency[j] = visited;
                     }
                 }
                 if(frequency[i] != visited)
                     frequency[i] = count;
             }

             //Displays the frequency of each element present in array
             System.out.println("***************************************");
             System.out.println(" Element | Frequency");
             System.out.println("***************************************");
             for(int i = 0; i < frequency.length; i++){
                 if(frequency[i] != visited)
                     System.out.println("    " + array[i] + "    |    " + frequency[i]);
             }
        System.out.println("***************************************");
         }

    }

