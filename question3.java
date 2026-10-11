// Find Kth smallest element from array.

public class question3 {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int st = 0;
        int end = arr.length - 1; 
        Quick(arr, st, end);
        int k=3;

        System.out.println(arr[k-1]);

    }

    public static void Quick(int[] arr, int st, int end) {
        if (st < end) {
            int pvt = partition(arr, st, end);
            Quick(arr, st, pvt - 1);
            Quick(arr, pvt + 1, end);
        }
    }

    public static int partition(int arr[], int st, int end) {
        int pivot = arr[end]; 
        int pvtidx = st - 1;  

        for (int j = st; j < end; j++) {
            if (arr[j] < pivot) {
                pvtidx++;
                int temp = arr[pvtidx];
                arr[pvtidx] = arr[j];
                arr[j] = temp;
            }
        }

        pvtidx++;
        int temp = arr[pvtidx];
        arr[pvtidx] = arr[end];
        arr[end] = temp;

        return pvtidx; 
    }
}
