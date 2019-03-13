package sortBasic;

import domain.Student;

import static sortBasic.SortUtils.less;
import static sortBasic.SortUtils.print;
import static sortBasic.SortUtils.swap;

/**
 * 选择排序
 * selection sort
 *
 * @author 汪永晖
 */
public class SelectionSort implements SortAlgorithm {


    /**
     * this method implements selection sort
     * sorts the array in increasing order
     *
     * @param unsorted unsorted array
     * @return sorted array
     */
    @Override
    public <T extends Comparable<T>> T[] sort(T[] unsorted) {

        int length = unsorted.length;

        for (int i = 0; i < length - 1; i++) {
            // init the value of min
            int min = i;

            for (int j = i + 1; j < length; j++) {
                // if second < first set min = second
                if (less(unsorted[j], unsorted[min])) {
                    min = j;
                }
            }

            // Swapping if index of min is changed
            if (min != i) {
                swap(unsorted, i, min);
            }
        }

        return unsorted;
    }

    /**
     * test the above method
     */
    public static void main(String[] args) {
        Integer[] arr = {4, 23, 6, 78, 1, 54, 231, 9, 12};

        SelectionSort selectionSort = new SelectionSort();

        Integer[] sorted = selectionSort.sort(arr);

        // Output => 1	  4	 6	9	12	23	54	78	231
        print(sorted);

        // String Input
        String[] strings = {"c", "a", "e", "b", "d"};
        String[] sortedStrings = selectionSort.sort(strings);

        //Output => a	b	 c  d	e
        print(sortedStrings);

        Student[] unSortedStudents = new Student[]{new Student("alex", 1),
                new Student("wyh", 3),
                new Student("xu", 3),
                new Student("wyh", 3),
                new Student("cold", 4)};
        Student[] sortedStudents = selectionSort.sort(unSortedStudents);

        print(sortedStudents);
    }
}
