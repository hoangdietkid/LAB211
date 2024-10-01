package TranHoangViet_DE180482_SE18D10_week1.letterandcharactercount;

import java.util.HashMap;
import java.util.Scanner;

public class LetterAndCharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your content: ");
        String content = scanner.nextLine();
        HashMap<String, Integer> wordsMap = new HashMap<>();
        String[] str = content.split("\\s+");
        for (String word : str) {
            if (!wordsMap.containsKey(word)) {
                wordsMap.put(word, 1);
            } else {
                int value = wordsMap.get(word);
                wordsMap.put(word, value + 1);
            }
        }

        HashMap<Character, Integer> lettersMap = new HashMap<>();

        for (int i = 0; i < content.length(); i++) {
            char letter = content.charAt(i);
            if (Character.isLetter(letter)) {
                if (!lettersMap.containsKey(letter)) {
                    lettersMap.put(letter, 1);
                } else {
                    int value = lettersMap.get(letter);
                    lettersMap.put(letter, value + 1);
                }
            }
        }

        System.out.println(wordsMap);
        System.out.println(lettersMap);

        scanner.close();
    }
}
