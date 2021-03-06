package com.company.Homework1;

import java.util.Arrays;
import java.util.Scanner;

public class Restore {

    private static int[] enterArr() {
        int count;
        int [] arr;
        Scanner in = new Scanner(System.in);

        System.out.print("Введіть розмірність масива: ");
        count = in.nextInt();
        arr = new int[count];

        System.out.print("Введіть масив: ");
        for (int i = 0; i < count; i++ ){
            arr [i] = in.nextInt();
        }
        return arr;
    }

    private static int [] restoreArray(int[] arr) {
        int [] temp = Arrays.copyOf(arr, arr.length);

        for (int i = 1; i < temp.length-1; i++){
            if((Math.abs(temp[i + 1] - temp[i - 1]) == 2) && (temp[i] < 0) ){
                temp[i] = (temp[i + 1] + temp[i - 1]) / 2;
            }
        }
        return temp;
    }

    public  static void main(String[] args) {
        int[] copied = restoreArray(enterArr());

        System.out.println("Результат: ");
        System.out.println(Arrays.toString(copied));
    }
}
