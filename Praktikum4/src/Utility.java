public class Utility {
    public static <T> void swap(T[] arr, int i, int j) {
        if (i >= 0 && i < arr.length && j >= 0 && j < arr.length) {
            T temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> T[] repeat(T[] arr, int N) {
        T[] newArr = (T[]) java.lang.reflect.Array.newInstance(arr.getClass().getComponentType(), arr.length * N);

        for (int i = 0; i < arr.length * N; i++) {
            newArr[i] = arr[i % arr.length];
        }

        return (T[]) newArr;
    }

    public static <T> String join(T[] arr) {
        String[] strArr = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            strArr[i] = String.valueOf(arr[i]);
        }

        return String.join(",", strArr);
    }

    public static <T extends Number> Double sum(T[] arr) {
        Double N = 0.0;

        for (int i = 0; i < arr.length; i++) {
            N += arr[i].doubleValue();
        }

        return N;
    }
}