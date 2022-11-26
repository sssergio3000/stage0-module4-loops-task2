package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive<2){
            return;
        } else if (printToInclusive==2){
            System.out.println(printToInclusive);
            return;
        }
        int count = 3;
        boolean flag = false;
        while (count <= printToInclusive) {

            for (int i = 3; i <= count / 2; i++) {
                if (count % i != 0 ) {
                    System.out.println(count);
                }
            }
            count++;
        }
    }

    public static void main(String[] args) {
        PrimeNumbers pn = new PrimeNumbers();
        pn.printPrimeNumbers(2);
    }
}
