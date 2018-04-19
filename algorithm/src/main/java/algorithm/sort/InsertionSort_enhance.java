package algorithm.sort;

/**
 * @author AndyChen
 * @version <ul>
 *          <li>2018/4/18 AndyChen,new
 *          </ul>
 * @since 2018/4/18
 */
public class InsertionSort_enhance implements Sort {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            T temp = array[i]; // 備份當前數
            int j;
            for (j = i; j > 0; j--) {
                if (temp.compareTo(array[j - 1]) < 0) {
                    array[j] = array[j - 1]; //前一個數比備份的數大，往後搬一個位置
                } else { // 代表更前面的數也都小於當前j
                    break;
                }
            }
            array[j] = temp; //將備份數插入當前index
        }
        return array;
    }
}
