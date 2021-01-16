/**
 * @author      : Henrique Vital Carvalho (henriquevital1000@hotmail.com)
 * @file        : Main
 * @created     : sábado jan 16, 2021 15:44:52 -03
 */

public class Main
{
    public static void main(String[] args)
    {
       SelectionSort selectionSort = new SelectionSort();
        int array[] = {64,25,12,22,11};
        System.out.println("Before:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        selectionSort.sort(array);
        System.out.println("\nAfter: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}


