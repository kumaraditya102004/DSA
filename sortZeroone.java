public class sortZeroone {

    public static void sort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            
            while (arr[left] == 0 && left < right) {
                left++;
            }

            
            while (arr[right] == 1 && left < right) {
                right--;
            }

            // Swap
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 1, 0, 1, 0, 0, 1};

        sort(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}