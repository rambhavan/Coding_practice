
public class SortingBubble2 {
    public static void main(String[] args) {
        int a[] = new int[]{8, 9, 10, 85, 40, 77, 78, 85, 96};
        //print array
        System.out.println("Array before Bubble sorting");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        // sorting through bubble sort
        bubbleSort(a);
        System.out.println("");
        //print array sorting
        System.out.println("Array after sorting");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

    private static void bubbleSort(int[] a) {
        int n = a.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (a[j - 1] < a[j]) {
                    //swap
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;

                }
            }
        }
    }
}
