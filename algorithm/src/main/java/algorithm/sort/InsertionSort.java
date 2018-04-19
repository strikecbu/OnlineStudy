package algorithm.sort;

import algorithm.sort.tool.SortHelper;

/**
 * @author AndyChen
 * @version <ul>
 *          <li>2018/4/18 AndyChen,new
 *          </ul>
 * @since 2018/4/18
 */
public class InsertionSort implements Sort {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j].compareTo(array[j - 1]) < 0) { // j < j-1 swap
                    SortHelper.swap(array, j, j - 1);
                } else { // j > j - 1 代表更前面的數也都小於當前j
                    break;
                }
            }
        }
        return array;
    }
}
