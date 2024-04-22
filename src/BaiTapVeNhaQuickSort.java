public class BaiTapVeNhaQuickSort {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 5, 1, 2, 1, 4, 12, 1, 2, 3, 3, 4, 5, 6, 2, 2};
        int N = inputArray.length;
        displayArray(inputArray);
        quickSort(inputArray, 0, N - 1);
        displayArray(inputArray);
        int[] newArray = new int[inputArray.length];
        int j = 0;
        int value = inputArray[j];
        newArray[j] = value;
        for (int i = 0; i < newArray.length; i++) {
            if (value != inputArray[i]) {
                value = inputArray[i];
                j++;
                newArray[j] = value;
            }
        }
        inputArray = newArray;
        displayArray(inputArray);
    }

    public static void displayArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println(" ");
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
