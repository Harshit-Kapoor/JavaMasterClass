// w.a.p to print Minimum element in an array
package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        int count =  10;
        int[] arr = readIntegers(count);
        System.out.println(Arrays.toString(arr));
        int min = findMin(arr);
        System.out.println(min);
    }

    public static int[] readIntegers(int count){

        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<count;i++){
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int findMin(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
