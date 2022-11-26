package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String s = "";
        for (char aChar : chars) {
            s+=aChar;

        }
        System.out.println(s);


    }

    public static void main(String[] args) {
        WordsBuilder wb = new WordsBuilder();
        wb.buildPhrase('a','b','c');

    }
}
