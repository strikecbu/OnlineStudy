package algorithm.sort.tool;

import algorithm.sort.*;

import java.util.Arrays;
import java.util.Date;

/**
 * @author AndyChen
 * @version <ul>
 *          <li>2018/4/18 AndyChen,new
 *          </ul>
 * @since 2018/4/18
 */
public class SortTester {

    public static void main(String[] args) {
        Sort selectionSort = new SelectionSort();
        Sort insertionSort = new InsertionSort();
        Sort InsertionSort_enhance = new InsertionSort_enhance();
        Sort mergeSort = new MergeSort();
        Sort mergeSort_BU = new MergeSort_BU();
        int number = 30000;

        System.out.println("================= random array test ===============");
        Integer[] randomArray = SortHelper.randomIntArray(number, number);
        testSort(selectionSort, Arrays.copyOf(randomArray, randomArray.length));
        testSort(insertionSort, Arrays.copyOf(randomArray, randomArray.length));
        testSort(InsertionSort_enhance, Arrays.copyOf(randomArray, randomArray.length));
        testSort(mergeSort, Arrays.copyOf(randomArray, randomArray.length));
        testSort(mergeSort_BU, Arrays.copyOf(randomArray, randomArray.length));

        System.out.println("================= nearly order array test ===============");
        Integer[] nearlyOrderArray = SortHelper.randomNearlyOrderArray(number, 3000);
        testSort(selectionSort, Arrays.copyOf(nearlyOrderArray, nearlyOrderArray.length));
        testSort(insertionSort, Arrays.copyOf(nearlyOrderArray, nearlyOrderArray.length));
        testSort(InsertionSort_enhance, Arrays.copyOf(nearlyOrderArray, nearlyOrderArray.length));
        testSort(mergeSort, Arrays.copyOf(nearlyOrderArray, nearlyOrderArray.length));
        testSort(mergeSort_BU, Arrays.copyOf(nearlyOrderArray, nearlyOrderArray.length));
    }

    public static <T extends Comparable<T>> void testSort(Sort sortObj, T[] array)  {
        long startTime = new Date().getTime();
        sortObj.sort(array);
        long endTime = new Date().getTime();
        boolean verify = verify(array);
        assert verify;
        if (!verify)
            System.out.println("verify fail");
        String className = sortObj.getClass().getName();
        className = className.substring(className.lastIndexOf(".") + 1);
        System.out.println(className + " sort size: " + array.length + " array, spent " + ((endTime - startTime) / 1000.0) + " s");
    }

    public static <T extends Comparable<T>> boolean verify(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0)
                return false;
        }
        return true;
    }

}
