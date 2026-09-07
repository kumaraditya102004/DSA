public class binary1search {

    public static int getUpperBound(int[] arr, int target) {

        int s = 0;
        int e = arr.length - 1;
        int ans = arr.length;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (arr[mid] > target) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 30, 30, 40, 50};
        int target = 30;

        int ans = getUpperBound(arr, target);

        System.out.println("Upper Bound: " + ans);
    }
}