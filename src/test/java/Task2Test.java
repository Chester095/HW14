import org.junit.Assert;
import org.junit.Test;

public class Task2Test {
    @Test
    public void checkArray() {
        int[] array1 = {1, 1, 1, 4, 4, 1, 4, 4};
        int[] array2 = {1, 1, 1, 1, 1, 1};
        int[] array3 = {4, 4, 4, 4};
        int[] array4 = {1, 4, 4, 1, 1, 4, 3};

        Assert.assertTrue(Task2.checkArray(array1));
        Assert.assertFalse(Task2.checkArray(array2));
        Assert.assertFalse(Task2.checkArray(array3));
        Assert.assertTrue(Task2.checkArray(array4));

        Assert.assertTrue(Task2.checkArray2(array1));
        Assert.assertFalse(Task2.checkArray2(array2));
        Assert.assertFalse(Task2.checkArray2(array3));
        Assert.assertFalse(Task2.checkArray2(array4));
    }
}
