public class Mergesort {
    public static void merge(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftSubarray = new int[n1];
        int[] rightSubarray = new int[n2];

        System.arraycopy(arr, left, leftSubarray, 0, n1);

        for (int j = 0; j < n2; j++) {
            rightSubarray[j] = arr[middle + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftSubarray[i] <= rightSubarray[j]) {
                arr[k] = leftSubarray[i];
                i++;
            } else {
                arr[k] = rightSubarray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftSubarray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightSubarray[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }
}
