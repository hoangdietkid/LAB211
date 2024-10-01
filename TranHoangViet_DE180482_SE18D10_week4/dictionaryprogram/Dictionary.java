package TranHoangViet_DE180482_SE18D10_week4.dictionaryprogram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Dictionary {
    public static HashMap<String, String> wordMaps = new HashMap<>();
    public static InputValid input = new InputValid();
    public static String fileName = "dictionary.txt";

    public HashMap<String, String> getWordMap() {
        return wordMaps;
    }

    public void setWordMap(HashMap<String, String> wordMaps) {
        Dictionary.wordMaps = wordMaps;
    }

    public void readFile() throws IOException {
        wordMaps.clear();
        File infile = new File(fileName);
        FileReader fReader = new FileReader(infile);
        BufferedReader bReader = new BufferedReader(fReader);
        try {
            String line = bReader.readLine();
            while (line != null) {
                String[] temp = line.split(":");
                wordMaps.put(temp[0], temp[1]);
                line = bReader.readLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.exit(0);
        }
        bReader.close();
    }

    public void writeFile() throws IOException {
        File inFile = new File(fileName);
        FileWriter fWrite = new FileWriter(inFile);
        try {
            for (String key : wordMaps.keySet()) {
                fWrite.write(key + ":" + wordMaps.get(key) + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
        fWrite.close();
    }

    public void addWord() throws IOException {
        System.out.println("------------------Add-------------------");
        System.out.println("Enter English: ");
        String wordEng = input.checkInputString();
        System.out.println("Enter VietNamese: ");
        String wordVie = input.checkInputString();
        readFile();
        for (String temp : wordMaps.keySet()) {
            if (temp.equals(wordEng)) {
                System.out.println("Do you want to update:");
                if (!input.checkInputYN()) {
                    break;
                } else {
                    return;
                }
            }
        }
        wordMaps.put(wordEng, wordVie);
        writeFile();
        System.out.println("Successful");
    }

    public void delWord() throws IOException {
        System.out.println("------------------Del-------------------");
        System.out.println("Enter English: ");
        String check = input.checkInputString();
        readFile();
        for (String temp : wordMaps.keySet()) {
            if (!check.equals(temp)) {
                System.out.println("Not existed");
            } else {
                wordMaps.remove(temp);
            }
        }
        writeFile();
        System.out.println("Successful");
    }

    public void searchWord() throws IOException {
        System.out.println("------------------Search-------------------");
        System.out.println("Enter English: ");
        String wordEng = input.checkInputString();
        readFile();
        for (String temp : wordMaps.keySet()) {
            if (wordEng.equals(temp)) {
                System.out.println("Vietnamese: " + wordMaps.get(wordEng));
                return;
            }
        }
        System.out.println("Not existed");
    }
}
