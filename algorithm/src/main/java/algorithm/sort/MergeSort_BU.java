package algorithm.sort;

/**
 * @author AndyChen
 * @version <ul>
 *          <li>2018/4/24 AndyChen,new
 *          </ul>
 * @since 2018/4/24
 */
public class MergeSort_BU extends MergeSort {
    //BU => bottom up
    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        for (int size = 1, length = array.length; size <= length; size += size) {
            for (int i = 0; i + size < length; i += (size + size)) {
                if (array[i + size - 1].compareTo(array[i + size]) > 0)
                    super.merge(array, i, i + size - 1, Math.min(i + size + size - 1, length - 1));
            }
        }
        return array;
    }
}
