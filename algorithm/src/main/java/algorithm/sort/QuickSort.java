package algorithm.sort;

import algorithm.sort.tool.SortHelper;


/**
 * @author AndyChen
 * @version <ul>
 *          <li>2018/5/3 AndyChen,new
 *          </ul>
 * @since 2018/5/3
 */
public class QuickSort implements Sort {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    /**
     * sort array[l...r]
     *
     * @param array
     * @param l
     * @param r
     * @param <T>
     */
    private <T extends Comparable<T>> void quickSort(T[] array, int l, int r) {
        if (l >= r)
            return;
        int p = partition(array, l, r);
        quickSort(array, l, p - 1);
        quickSort(array, p + 1, r);
    }

    /**
     * p 代表 array[l...j - 1] < array[p] , array[p+1...r] > array[p]
     *
     * @param array
     * @param l
     * @param r
     * @param <T>
     * @return
     */
    private <T extends Comparable<T>> int partition(T[] array, int l, int r) {
        int j = l;
        for (int i = l + 1; i <= r; i++) {
            if (array[i].compareTo(array[l]) < 0) {
                SortHelper.swap(array, ++j, i);
            }
        }
        SortHelper.swap(array, l, j);
        return j;
    }


}
