public class Array {

    public static double getAverage(int[] arr) {
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        int size = arr.length;

        double avg = sum / (double) size;

        return avg;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 3};

        System.out.println(getAverage(arr));
    }
}
    

