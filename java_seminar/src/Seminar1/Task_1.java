package Seminar1;

public class Task_1 {
    public static void main(String[] args) {
//        Solution.subtractProductAndSum(int n = 123);

    }
    public int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        while (n > 0) {
            prod = prod * (n % 10);
            sum += n % 10;
            n /= 10;

        }
        return prod - sum;

    }
}