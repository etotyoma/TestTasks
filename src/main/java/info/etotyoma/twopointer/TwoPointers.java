package info.etotyoma.twopointer;

import java.util.Arrays;

public class TwoPointers {

//    Дан отсортированный массив целых чисел с дубликатами.
//    Необходимо удалить дубликаты и все оставшиеся значения сдвинуть влево.
//    Пример: [1,1,1,2,2,3,3,3,3];
//    Результат: [1,2,3]

    public static void main(String[] args) {
        // test cases
        System.out.println(Arrays.toString(removeDuplicates(new int[]{1, 1, 1, 2, 2, 3, 3, 3, 3})));
        // output: [1, 2, 3]
        System.out.println(Arrays.toString(removeDuplicates(new int[]{})));
        // output: []
        System.out.println(Arrays.toString(removeDuplicates(new int[]{1})));
        // output: [1]
    }

    private static int[] removeDuplicates(int[] array) {
        if (array == null) return array;
        return Arrays.stream(array).distinct().toArray();
    }
}
