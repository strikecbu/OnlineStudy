package algorithm.sort.tool;

import algorithm.sort.InsertionSort;
import algorithm.sort.InsertionSort_enhance;
import algorithm.sort.SelectionSort;
import algorithm.sort.Sort;

import java.util.Date;

import static javafx.scene.input.KeyCode.T;


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
        int number = 50000;

        System.out.println("================= random array test ===============");
        Integer[] randomArray = SortHelper.randomIntArray(number, number);
        testSort(selectionSort, SortHelper.copyArray(randomArray));
        testSort(insertionSort, SortHelper.copyArray(randomArray));
        testSort(InsertionSort_enhance, SortHelper.copyArray(randomArray));

        System.out.println("================= nearly order array test ===============");
        Integer[] nearlyOrderArray = SortHelper.randomNearlyOrderArray(number, 3000);
        testSort(selectionSort, SortHelper.copyArray(nearlyOrderArray));
        testSort(insertionSort, SortHelper.copyArray(nearlyOrderArray));
        testSort(InsertionSort_enhance, SortHelper.copyArray(nearlyOrderArray));
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
