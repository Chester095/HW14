import java.util.ArrayList;

public class Task1 {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] array2 = {1, 2, 5, 4, 2, 3, 2, 1, 7};
        int[] array3 = {1, 2, 4, 6, 2, 3, 7, 1, 7};
        int[] array4 = {1, 2, 8, 5, 2, 3, 2, 1, 7};

        System.out.println(checkArray(array1));
        System.out.println(checkArray(array2));
        System.out.println(checkArray(array3));
        System.out.println(checkArray(array4));

    }

    public static ArrayList<Integer> checkArray(int[] arrayName) {
        ArrayList<Integer> resultArray = new ArrayList<>();
        try {
            for (int i = arrayName.length - 1; i >= -1; i--) {
                if (arrayName[i] == 4) {
                    break;
                } else {
                    resultArray.add(0, arrayName[i]);
                }
            }
        } catch (RuntimeException ex) {
            throw new RuntimeException("Не найдена 4 в массиве.");
        }

        return resultArray;
    }
}
