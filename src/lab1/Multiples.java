package lab1;

public class Multiples {
    public static void main(String[] args) {
        int toPrint = multiples(1000, 3, 5);
        System.out.println(toPrint);
    }

    public static int multiples(int n, int a, int b) {
        int toPrint = 0;

        for (int i = 1; i < n; i++)
        {
            if (i % a == 0 || i % b == 0) {
                toPrint++;
                System.out.println(i);
            }
        }
        return toPrint;
    }
}
