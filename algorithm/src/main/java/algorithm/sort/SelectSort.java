package algorithm.sort;

import algorithm.sort.tool.SortHelper;

import java.util.Date;

/**
 * @author AndyChen
 * @version <ul>
 *          <li>2018/4/16 AndyChen,new
 *          </ul>
 * @since 2018/4/16
 */
public class SelectSort implements Sort {

    public static void main(String[] args) {
        SelectSort selectSort = new SelectSort();
        Integer[] test = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        selectSort.sort(test);
        for (int i : test) {
            System.out.println(i);
        }
        String[] test1 = {"B", "A", "D", "C", "E"};
        selectSort.sort(test1);
        for (String i : test1) {
            System.out.println(i);
        }
    }

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            SortHelper.swap(array, minIndex, i);
        }
        return array;
    }
}
