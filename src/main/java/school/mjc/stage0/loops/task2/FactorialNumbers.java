package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int num = 0;
        while (num <= printToInclusive) {
            long factorial = calculateFactorial(num);
            System.out.println(num + "! = " + factorial);
            num++;
        }
    }

    private long calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }

        long factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
