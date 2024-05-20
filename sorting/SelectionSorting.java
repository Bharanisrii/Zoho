package sorting;

public class SelectionSorting {
    public static void main(String[] args) {
        int arr[] = {3, 41, 18, 11, 39, 22};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        for (int i1 : arr) {
            System.out.print(i1 + " ");
        }
        System.out.println();
    }
}
