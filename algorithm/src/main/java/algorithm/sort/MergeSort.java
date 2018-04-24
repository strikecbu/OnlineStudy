package algorithm.sort;

import java.util.Arrays;

/**
 * @author AndyChen
 * @version <ul>
 *          <li>2018/4/20 AndyChen,new
 *          </ul>
 * @since 2018/4/20
 */
public class MergeSort implements Sort {
    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        this.mergeSort(array, 0, array.length - 1);
        return array;
    }


    //排序array[l...r]
    private <T extends Comparable<T>> void mergeSort(T[] array, int l, int r) {

        if (l >= r)
            return;

        int mid = (l + r) / 2;
        mergeSort(array, l, mid);
        mergeSort(array, mid + 1, r);
        if (array[mid].compareTo(array[mid + 1]) < 0)
            return;
        merge(array, l, mid, r);
    }

    protected  <T extends Comparable<T>> void merge(T[] array, int l, int mid, int r) {

        T[] temp = Arrays.copyOf(array, array.length);

        int j = l;
        int k = mid + 1;
        for (int i = l; i <= r; i++) {
            if (j > mid) {
                array[i] = temp[k];
                k++;
            } else if (k > r) {
                array[i] = temp[j];
                j++;
            } else if (temp[j].compareTo(temp[k]) < 0) {
                array[i] = temp[j];
                j++;
            } else {
                array[i] = temp[k];
                k++;
            }
        }
    }
}
