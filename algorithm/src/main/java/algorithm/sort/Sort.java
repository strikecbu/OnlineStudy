package algorithm.sort;

import static javafx.scene.input.KeyCode.T;

/**
 * @author AndyChen
 * @version <ul>
 *          <li>2018/4/18 AndyChen,new
 *          </ul>
 * @since 2018/4/18
 */
public interface Sort {
    public <T extends Comparable<T>> T[] sort(T[] array);
}
