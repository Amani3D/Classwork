package repl;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        String[] arr = {"A1","B2","C3"};

        System.out.println(Arrays.toString(swap(arr)));



    }

    public static String[] swap(String[] stringArray) {

        int start = 0;
        int end = stringArray.length-1;

        String temp;

        while (start < end)
        {
            temp = stringArray[start];
            stringArray[start] = stringArray[end];
            stringArray[end] = temp;
            start++;
            end--;
        }

        return stringArray;
    }



    }

