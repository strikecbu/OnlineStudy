package algorithm;

import java.util.Arrays;

/**
 * @author AndyChen
 * @version <ul>
 *          <li>2018/4/16 AndyChen,new
 *          </ul>
 * @since 2018/4/16
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] test = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort(test);
        for (int i : test) {
            System.out.println(i);
        }
    }

    private static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
                swap(array, i, j);
            }
        }
        return array;
    }

    private static int[] swap(int[] obj, int i, int j) {
        int temp = obj[i];
        obj[i] = obj[j];
        obj[j] = temp;
        return obj;
    }
}
