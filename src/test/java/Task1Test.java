
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class Task1Test {

    @Test
    public void checkArray() {
        int[] array1 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] array2 = {1, 2, 5, 4, 2, 3, 2, 1, 7};
        int[] array3 = {1, 2, 4, 6, 2, 3, 7, 1, 7};
        int[] array4 = {1, 2, 8, 5, 2, 3, 2, 1, 7};
        ArrayList<Integer> resultArray1 = new ArrayList<>();
        resultArray1.add(1);
        resultArray1.add(7);

        ArrayList<Integer> resultArray2 = new ArrayList<>();
        resultArray2.add(2);
        resultArray2.add(3);
        resultArray2.add(2);
        resultArray2.add(1);
        resultArray2.add(7);

        ArrayList<Integer> resultArray3 = new ArrayList<>();
        resultArray3.add(6);
        resultArray3.add(2);
        resultArray3.add(3);
        resultArray3.add(7);
        resultArray3.add(1);
        resultArray3.add(7);


        Task1.checkArray(array1);
        Task1.checkArray(array2);
        Task1.checkArray(array3);



        Assert.assertEquals(resultArray1, Task1.checkArray(array1));
        Assert.assertEquals(resultArray2, Task1.checkArray(array2));
        Assert.assertEquals(resultArray3, Task1.checkArray(array3));


        try {
            Task1.checkArray(array4);
            Assert.fail("Expected RuntimeException");
        } catch (RuntimeException ex) {
            Assert.assertNotEquals("", ex.getMessage());
        }
    }
}
