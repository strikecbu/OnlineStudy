package algorithm.sort.tool;

import algorithm.sort.InsertaionSort;
import algorithm.sort.SelectSort;
import algorithm.sort.Sort;

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
        SelectSort selectSort = new SelectSort();
        testSort(selectSort);
        InsertaionSort insertaionSort = new InsertaionSort();
        testSort(insertaionSort);
    }

    public static void testSort(Sort sortObj) {
        int number = 10000;
        Integer[] array = SortHelper.randamIntArray(number, number);
        long startTime = new Date().getTime();
        sortObj.sort(array);
        long endTime = new Date().getTime();
        boolean verify = verify(array);
        assert verify;
        if (!verify)
            System.out.println("verify fail");
        String className = sortObj.getClass().getName();
        className = className.substring(className.lastIndexOf(".") + 1);
        System.out.println(className + " sort size: " + number + " array, spent " + ((endTime - startTime) / 1000.0) + " s");
    }

    public static <T extends Comparable<T>> boolean verify(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0)
                return false;
        }
        return true;
    }

}
