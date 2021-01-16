/**
 * @author      : Henrique Vital Carvalho (henriquevital1000@hotmail.com)
 * @file        : SelectionSort
 * @created     : sábado jan 16, 2021 15:40:21 -03
 */

public class SelectionSort
{
    public SelectionSort()
    {

    }
    public void sort(int[] array){
        for (int i=0; i < array.length; i++) {
            int min = i, temp = array[i];
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[min]){
                    min = j;
                }
            }
            array[i] = array[min];
            array[min] = temp;
        }
    }
}


