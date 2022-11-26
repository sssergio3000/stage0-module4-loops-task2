package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int count = 0;
        while(count<=lastPrinted){
            System.out.println(count);
            count++;
        }

    }

    public static void main(String[] args) {
        NaturalNumbers nn = new NaturalNumbers();
        nn.naturalNumbersPrinter(10);
    }
}
