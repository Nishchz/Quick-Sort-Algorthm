public class DivideConquer {
    
 
    public static void quicksort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int pidx = partition(arr, si, ei);

        quicksort(arr, si, pidx - 1);
        quicksort(arr, pidx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;   // space for smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[ei];
        arr[ei] = temp;

        return i + 1;
    }

    public static void printArray(int arr[]) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 8, 2, 5};
        quicksort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
