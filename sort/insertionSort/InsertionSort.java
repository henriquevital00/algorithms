/**
 * @author      : Henrique Vital Carvalho (henriquevital1000@hotmail.com)
 * @file        : InsertionSort
 * @created     : sábado jan 16, 2021 16:02:04 -03
 */

public class InsertionSort
{
    public InsertionSort()
    {

    }

    public void sort(int[] array){
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public void sort2(int[] array){
        for (int i = 0; i < array.length; i++) {
            int j = i-1, value = array[i];
            while(j >= 0 && array[j] > value){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = value;
        }
    }
}


