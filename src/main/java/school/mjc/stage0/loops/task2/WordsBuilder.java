package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        StringBuilder phrase = new StringBuilder();
        int index = 0;
        while (index < chars.length) {
            phrase.append(chars[index]);
            index++;
        }
        System.out.println(phrase);
    }
}
