package info.etotyoma.twosum;

public class TwoSums {

//    Дан отсортированный массив целых чисел и целевая сумма.
//    Необходимо написать алгоритм поиска двух чисел в массиве,
//    которые в сумме равны целевой сумме. Результат вывести на экран.
//    Пример: [1,2,5,6,7,8] 	целевая сумма = 11;
//    Результат: 5+6 = 11

    public static void main(String[] args) {
        // test cases
        System.out.println(twoSums(new int[]{1, 2, 5, 6, 7, 8}, 11));
        // output: 5 + 6 = 11
        System.out.println(twoSums(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 14));
        // output: 6 + 8 = 14
        System.out.println(twoSums(new int[]{1, 2, 3, 4, 5}, 28));
        // output: 0
        System.out.println(twoSums(new int[]{}, 28));
        // output: 0
    }

    private static String twoSums(int[] sortedArray, int targetSum) {
        if (sortedArray == null) return "0";

        for (int k : sortedArray) {
            for (int i : sortedArray) {
                if (k + i == targetSum)
                    return String.format("%d + %d = %d",
                            k,
                            i,
                            targetSum);
            }
        }
        return "0";
    }
}
