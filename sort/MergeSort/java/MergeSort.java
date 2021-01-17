/**
 * @author      : Henrique Vital Carvalho (henriquevital1000@hotmail.com)
 * @file        : MergeSort
 * @created     : sábado jan 16, 2021 17:02:01 -03
 */
import java.util.ArrayList;
import java.util.List;

public class MergeSort
{
    public MergeSort()
    {

    }

    public List<Integer> sort(List<Integer> array){
        if (array.size() == 1){
            return array;
        }
        List<Integer> left = array.subList(0, array.size()/2);
        List<Integer> right = array.subList(array.size()/2, array.size());

        return merge(sort(left), sort(right));
    }

    public List<Integer> merge(List<Integer> left, List<Integer> right){
        int leftIndex = 0, rightIndex = 0;
        List<Integer> result = new ArrayList<Integer>();

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex) < right.get(rightIndex)){
                result.add(left.get(leftIndex));
                leftIndex++;
            }
            else{
                result.add(right.get(rightIndex));
                rightIndex++;
            }
        }
        List<Integer> test = left.subList(leftIndex, left.size());
        result.addAll(test);
        List<Integer> test2 = right.subList(rightIndex, right.size());
        result.addAll(test2);
        return result;
    }

    public void printArray(List<Integer> array){
        for(int i : array){
            System.out.print(i + " ");
        }
    }
}


