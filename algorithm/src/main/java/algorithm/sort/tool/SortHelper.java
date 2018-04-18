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

    public static Integer[] randamIntArray(int numbers, int maxNumber) {
        Integer[] ints = new Integer[numbers];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(maxNumber + 1);
        }
        return ints;
    }
}
