package algorithm.sort.tool;

import java.util.Random;

/**
 * @author AndyChen
 * @version <ul>
 *          <li>2018/4/18 AndyChen,new
 *          </ul>
 * @since 2018/4/18
 */
public class SortHelper {

    public static <T> T[] swap(T[] obj, int i, int j) {
        T temp = obj[i];
        obj[i] = obj[j];
        obj[j] = temp;
        return obj;
    }

    public static Integer[]copyArray(Integer[] array){
        Integer[] integers = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            integers[i] = array[i];
        }
        return integers;
    }

    public static Integer[] randomIntArray(int numbers, int maxNumber) {
        Integer[] ints = new Integer[numbers];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(maxNumber + 1);
        }
        return ints;
    }

    public static Integer[] randomNearlyOrderArray(int numbers, int swapTimes) {
        Integer[] integers = new Integer[numbers];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = i;
        }
        Random random = new Random();
        for (int i = 0; i < swapTimes; i++) {
            int indexA = random.nextInt(numbers);
            int indexB = random.nextInt(numbers);
            swap(integers, indexA, indexB);
        }
        return integers;
    }
}
