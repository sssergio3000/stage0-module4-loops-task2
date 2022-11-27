package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int count = 0;
        int mult = 1;
        if (multiplyByAndToInclusive > 0) {
            while (count <= multiplyByAndToInclusive) {
                mult *= count++;

                System.out.println(mult);

                if (mult==0){
                    mult=1;
                }
            }

        }
        if (multiplyByAndToInclusive < 0) {
            while (count >= multiplyByAndToInclusive) {
                mult *= count;
                count--;
                System.out.println(mult);
            }

        }

    }

    public static void main(String[] args) {
        Multiplication m = new Multiplication();
        m.printMultiplied(5);
    }
}
