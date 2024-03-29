package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("Too much power");
        }

        int num = 0;
        int result = 1;

        System.out.println("Powers of 2 from 2^0 to 2^" + power + ":");

        while (num <= power) {
            System.out.println("2^" + num + " = " + result);
            result *= 2;
            num++;
        }
    }
}
