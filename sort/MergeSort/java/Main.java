/**
 * @author      : Henrique Vital Carvalho (henriquevital1000@hotmail.com)
 * @file        : Main
 * @created     : sábado jan 16, 2021 17:01:25 -03
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String args[])
    {
        List<Integer> array = new ArrayList<Integer>();
        array.add(99);
        array.add(44);
        array.add(6);
        array.add(2);
        array.add(1);
        array.add(5);
        array.add(63);
        array.add(87);
        array.add(283);
        array.add(4);
        array.add(0);
        System.out.println("Before: ");
        for(int number: array){
            System.out.print(number + " ");
        }
        MergeSort mergeSort = new MergeSort();
        List<Integer> result = mergeSort.sort(array);
        System.out.println("\nAfter: ");
        for(int number: result){
            System.out.print(number + " ");
        }
    }
}


