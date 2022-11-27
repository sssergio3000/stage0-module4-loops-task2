package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive>2){
            System.out.println(2);
        }
        if (printToInclusive < 2) {
            return;
        } else if (printToInclusive == 2) {
            System.out.println(printToInclusive);
            return;
        }
        int count = 2;
        boolean flag = false;
        outer:
        while (count <= printToInclusive) {
            if (count % 2 == 0) {
                count++;
                continue;
            }

            for (int i = 2; i < count / 2; i++) {
                if (count % i == 0) {
                    count++;
                    continue outer;
                }
            }
            System.out.println(count);
            count++;
        }
    }

    public static void main(String[] args) {
        PrimeNumbers pn = new PrimeNumbers();
        pn.printPrimeNumbers(20);
    }
}
