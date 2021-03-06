package com.company;

public class Main {

    public static void main(String[] args) {
        int[] runnerArray = {8, 6, 7, 5, 3, 0};
        selectionSort(runnerArray);
        for (int i = 0; i < runnerArray.length; i++)
        {
            System.out.print(runnerArray[i] + " ");
        }
    }

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        System.out.println(temp);
        arr[i] = arr[j];
        arr[j] = temp;
    }

   public static void selectionSort(int[] list1)
    {
        int pos = 0;
        int minIndex = 0;
        for (int i = 0; i < list1.length; i++)
        {
            pos = i;
            int currentMin = list1[i];
            for (int x = i+1; x < list1.length; x++)
            {
                if (list1[x] < currentMin)
                {
                    minIndex = x;
                    swap(list1, minIndex, pos);
                }

            }
        }
   }
}
