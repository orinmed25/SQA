import org.junit.*;

public class sumPositiveTest {
    @Test
    public void testAllPositive() {
        int[] arr = { 1, 2, 3, 4, 5 };
        Assert.assertEquals(15, sumPositive.sum(arr, 5));
    }

    @Test
    public void testAllNegative() {
        int[] arr = { -1, -2, -3, -4, -5 };
        Assert.assertEquals(0, sumPositive.sum(arr, 5));
    }

    @Test
    public void testSinglePositive() {
        int[] arr = { 5 };
        Assert.assertEquals(5, sumPositive.sum(arr, 1));
    }

    @Test
    public void testSingleNegative() {
        int[] arr = { -3 };
        Assert.assertEquals(5, sumPositive.sum(arr, 1));
    }

    @Test
    public void testPositiveAndNegative() {
        int[] arr = { 2, -1, 3, -4 };
        Assert.assertEquals(5, sumPositive.sum(arr, 4));
    }

    @Test
    public void testPartialArray() {
        int[] arr = { 1, 2, 3, 4 };
        Assert.assertEquals(6, sumPositive.sum(arr, 3));
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        Assert.assertEquals(0, sumPositive.sum(arr, 0));
    }

    @Test
    public void testWithZeros() {
        int[] arr = { 1, 0, 2, 0, 3 };
        Assert.assertEquals(6, sumPositive.sum(arr, 5));
    }

    @Test
    public void testAllZeros() {
        int[] arr = { 0, 0, 0 };
        Assert.assertEquals(0, sumPositive.sum(arr, 3));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testSizeExceedsArrayLength() {
        int[] arr = { 1, 2, 3 };
        sumPositive.sum(arr, 5);
    }

    @Test(expected = NullPointerException.class)
    public void testNullArray() {
        sumPositive.sum(null, 0);
    }

    @Test
    public void testNegativeSize() {
        int[] arr = { 1, 2, 3 };
        Assert.assertEquals(0, sumPositive.sum(arr, -1));
    }
}