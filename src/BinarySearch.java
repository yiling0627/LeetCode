public class BinarySearch {

    public BinarySearch(){

    }

    public int binary_search(int a[], int target){
        if (a == null || a.length == 0) return -1;
        int l = 0;
        int r = a.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if(a[mid] == target) {
                return mid;
            } else if (a[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public int[] binary_search2D(int[][] arr, int target){
        int[] result = new int[2];
        if (arr.length == 0 || arr[0].length == 0) {
            result[0] = -1;
            result[1] = -1;
            return result;
        }
        int row = arr.length;
        int col = arr[0].length;
        int l = 0;
        int r = row * col - 1;
        while (l <= r){
            int mid = l + (r - l) / 2;
            int t1 = mid / col;
            int t2 = mid % col;
            if (arr[t1][t2] == target) {
                result[0] = t1;
                result[1] = t2;
                return result;
            } else if (arr[t1][t2] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        result[0] = -1;
        result[1] = -1;
        return result;
    }

    public int binary_search_closest (int[] arr, int target){
        if (arr.length == 0) return -1;
        int l = 0;
        int r = arr.length - 1;
        while (l + 1 < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                r = mid;
            } else {
                l = mid;
            }
        }
        // post processing
        if (Math.abs(target - arr[l]) > Math.abs(arr[r] - target)) {
            return r;
        } else {
            return l;
        }
    }

    public int binary_search_first_occur (int[] arr, int target) {
        if (arr.length == 0) return -1;
        int l = 0;
        int r = arr.length - 1;
        while (l + 1 < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                r = mid;
            } else if (arr[mid] > target) {
                r = mid;
            } else {
                l = mid;
            }
        }
        // post processing
        if (arr[l] == target) return l;
        if (arr[r] == target) return r;
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {2,4,6,8,10,11,17,19,21};
        BinarySearch b = new BinarySearch();
        System.out.println(b.binary_search(a,21));

        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(arr.length);
        int[] result = b.binary_search2D(arr,12);
        System.out.println(result[0] + "  " + result[1]);

        int arr1[] = {1,2,4,6,8,10,11,17,19,21};
        System.out.println(b.binary_search_closest(arr1,12));

        int arr2[] = {1,2,3,5,5,5,5,17,19,21};
        System.out.println(b.binary_search_first_occur(arr2,5));
    }
}
