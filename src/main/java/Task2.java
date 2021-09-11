public class Task2 {
    public static void main(String[] args) {
        int[] array1 = {1, 1, 1, 4, 4, 1, 4, 4};
        int[] array2 = {1, 1, 1, 1, 1, 1};
        int[] array3 = {4, 4, 4, 4};
        int[] array4 = {1, 4, 4, 1, 1, 4, 3};

        System.out.println(checkArray(array1));
        System.out.println(checkArray(array2));
        System.out.println(checkArray(array3));
        System.out.println(checkArray(array4));
        System.out.println();
        System.out.println(checkArray2(array1));
        System.out.println(checkArray2(array2));
        System.out.println(checkArray2(array3));
        System.out.println(checkArray2(array4));

//        Написать метод, который проверяет состав массива из чисел 1 и 4.
//        Если в нем нет хоть одной четверки или единицы, то метод вернет false;
//        Написать набор тестов для этого метода (по 3-4 варианта входных данных).
//        [ 1 1 1 4 4 1 4 4 ] -> true
//        [ 1 1 1 1 1 1 ] -> false
//        [ 4 4 4 4 ] -> false
//        [ 1 4 4 1 1 4 3 ] -> false

    }

    public static boolean checkArray(int[] array) {
        boolean resultOne = false;
        boolean resultFour = false;
        for (int j : array) {
            if (j == 1) {
                resultOne = true;
            } else if (j == 4) {
                resultFour = true;
            }
        }
        return resultOne && resultFour;
    }

    // Слегонца корректонул, а то результат не бьётся с ТЗ
    public static boolean checkArray2(int[] array) {
        boolean resultOne = false;
        boolean resultFour = false;
        boolean resultOther = true;
        for (int j : array) {
            if (j == 1) {
                resultOne = true;
            } else if (j == 4) {
                resultFour = true;
            } else {
                resultOther = false;
            }
        }
        return resultOne && resultFour && resultOther;
    }
}
