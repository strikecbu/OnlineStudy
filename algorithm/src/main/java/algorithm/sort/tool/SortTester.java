package algorithm.sort.tool;

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
    }

    public static void testSort(Sort sortObj) {
        int number = 100000;
        Integer[] testArray = SortHelper.randamIntArray(number, number);
        long startTime = new Date().getTime();
        sortObj.sort(testArray);
        long endTime = new Date().getTime();
        String className = sortObj.getClass().getName();
        className = className.substring(className.lastIndexOf(".") + 1);
        System.out.println(className + " sort size: " + number + " array, spent " + ((endTime - startTime) / 1000.0) + " s");
    }

}
