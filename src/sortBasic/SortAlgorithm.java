package sortBasic;

/**
 * The common interface of most sorting algorithms
 * @author 汪永晖
 */
public interface SortAlgorithm {

    /**
     *
     * @param unsorted 未被排序的数组
     * @param <T> 泛型
     * @return 排好序的数组
     */
    <T extends Comparable<T>> T[] sort(T[] unsorted);
}
