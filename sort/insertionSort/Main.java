/**
 * @author      : Henrique Vital Carvalho (henriquevital1000@hotmail.com)
 * @file        : main
 * @created     : sábado jan 16, 2021 16:01:15 -03
 */

public class Main
{
    public static void main(String args[])
    {
        int array[] = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        InsertionSort insertionSort = new InsertionSort();
        System.out.println("Before:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        insertionSort.sort2(array);
        System.out.println("\nAfter: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}


