package sortBasic;

import domain.Student;

import static sortBasic.SortUtils.less;
import static sortBasic.SortUtils.print;

/**
 * InsertionSort
 * 插入排序
 *
 * @author 汪永晖
 */
public class InsertionSort implements SortAlgorithm {

    /**
     * @param unsorted 未被排序的数组
     * @return 排好序的数组
     */
    @Override
    public <T extends Comparable<T>> T[] sort(T[] unsorted) {

        for (int i = 1; i < unsorted.length; i++) {

            T key = unsorted[i];
            int j;

            for (j = i; j >= 1 && less(key, unsorted[j - 1]); j--) {
                unsorted[j] = unsorted[j - 1];
            }

            unsorted[j] = key;
        }

        return unsorted;
    }


    public static void main(String[] args) {
        Integer[] arr = {4, 23, 6, 78, 1, 54, 231, 9, 12};

        InsertionSort insertionSort = new InsertionSort();
        print(insertionSort.sort(arr));

        Student[] unSortedStudents = new Student[]{new Student("alex", 1),
                new Student("wyh", 3),
                new Student("xu", 3),
                new Student("wyh", 3),
                new Student("cold", 4)};

        print(insertionSort.sort(unSortedStudents));

    }
}
