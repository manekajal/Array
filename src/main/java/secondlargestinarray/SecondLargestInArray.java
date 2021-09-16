package secondlargestinarray;

public class SecondLargestInArray {

    public static int getSecondLargest(int[] array,int total) {
        int temp;

        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return (array[total - 2]);
    }
    public static void main(String[] args)
    {
        int[] array = new int[]{23,2,8,65};
        System.out.println("Second Largest Element in Array: " +getSecondLargest(array,4));


    }

}
