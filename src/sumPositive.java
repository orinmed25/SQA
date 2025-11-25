public class sumPositive {
    public static int sum(int arr[], int size)
    {
        if (arr == null) {
            throw new NullPointerException("Array cannot be null");
        }
        int sum = 0;
        for(int i = 0; i < size; i++)
        {
            if (arr[i] > 0)
                sum += arr[i];
        }
        return sum;
    }
}