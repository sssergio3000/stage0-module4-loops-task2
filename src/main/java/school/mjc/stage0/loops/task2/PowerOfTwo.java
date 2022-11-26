package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power<0){
            System.out.println("too much power");
            return;
        }
        int pow = 0;
        while (pow<=power){
            System.out.println((int)Math.pow(2,pow));
            pow++;
        }

    }

    public static void main(String[] args) {
        PowerOfTwo pt = new PowerOfTwo();
        pt.printPower(5);

    }
}
