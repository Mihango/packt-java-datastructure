package labs.khobfa.arrays;

public class RemoveFromArray {

    private static int[] deleteFromArray(int[] a, int index) {
        if (index < 0) return a;
        int[] b = new int[a.length - 1];
        for (int i = 0; i < a.length; i++) {
            if (i == index) continue;
            if (i < index) b[i] = a[i];
            else b[i - 1] = a[i];
        }
        return b;
    }

    private static int[] addToArray(int[] a, int index, int value) {
        if (index < 0) return a;
        int[] b = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            if (i == index) {
                b[i] = value;
                b[i + 1] = a[i];
            } else {
                if (i < index) b[i] = a[i];
                else b[i + 1] = a[i];
            }
        }
        return b;
    }
}
