public class Recursion1 {


    static void printName(int n) {
        if (n == 0) {
            return;
        }

        System.out.println("Aditya");
        printName(n - 1);
    }

    public static void main(String[] args) {
        printName(10);
    }
}


