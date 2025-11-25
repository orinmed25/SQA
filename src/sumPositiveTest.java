import org.junit.*;

public class sumPositiveTest {
    @Test
    public void test(){
        int[] arr1 = {1, 2, 3, 4, 5};
        int size1 = 5;
        Assert.assertEquals(15, sumPositive.sumPositive(arr1, size1));
    }
}