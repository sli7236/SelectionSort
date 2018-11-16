package com.company;

public class Main {

    public static void main(String[] args) {
        int[] runnerArray = {8, 6, 7, 5, 3, 0};
        selectionSort(runnerArray);
        for (int i = 0; i < runnerArray.length; i++)
        {
            System.out.print(runnerArray[i]);
        }
    }

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        System.out.println(temp);
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void selectionSort(int[] arr)
    {
        int pos = 0;
        int currentMin = 0;
        for (int i = 0; i < arr.length; i++)
        {
            pos = i;
            currentMin = arr[i];
            for (int x = i+1; x < arr.length; x++)
            {
                if (arr[x] < currentMin)
                {
                    currentMin = x;
                }
                swap(arr, currentMin, pos);
            }
        }
    }
}
