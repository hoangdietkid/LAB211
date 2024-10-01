package TranHoangViet_DE180482_SE18D10_week4.dictionaryprogram;

import java.io.IOException;

public class ManageDicWord {
    public static Dictionary wordList = new Dictionary();
    public static Menu menu = new Menu();

    public static void main(String[] args) throws IOException {
        while (true) {
            int choice = menu.menu();
            switch (choice) {
                case 1:
                    wordList.addWord();
                    break;
                case 2:
                    wordList.delWord();
                    break;
                case 3:
                    wordList.searchWord();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
            }
        }
    }
}
