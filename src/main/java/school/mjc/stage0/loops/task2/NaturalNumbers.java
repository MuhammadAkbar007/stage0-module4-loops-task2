package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int num = 1;
        while (num <= lastPrinted) {
            System.out.println(num);
            num++;
        }
    }
}
