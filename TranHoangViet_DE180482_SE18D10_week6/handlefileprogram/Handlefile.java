package TranHoangViet_DE180482_SE18D10_week6.handlefileprogram;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Handlefile {
    public static InputValid input = new InputValid();

    public void checkInputPath() {
        System.out.println("Enter path: ");
        String path = input.checkInputString();
        File file = new File(path);
        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("Path to file");
            } else if (file.isDirectory()) {
                System.out.println("Path to Directory");
            }
        } else {
            System.out.println("Path doesn't exist ");
        }
    }

    public void getAllFileNameJavaInDirectory() {
        System.out.println("Enter path: ");
        String path = input.checkInputString();
        File file = new File(path);
        ArrayList<String> listFilejava = new ArrayList<>();
        if (file.exists() && file.isDirectory()) {
            File[] listfile = file.listFiles();
            for (int i = 0; i < listfile.length; i++) {
                if (listfile[i].isFile() && listfile[i].getName().endsWith(".java")) {
                    listFilejava.add(listfile[i].getName());
                }
            }
            System.out.println("Result " + listFilejava.size() + " file");
            for (String string : listFilejava) {
                System.out.println(string);
            }
        } else if (file.exists() && file.isFile() && file.getName().endsWith(".java")) {
            System.out.println(file.getName());
        } else {
            System.out.println("Path doesn't exist ");
        }
    }

    public void getFileWithSizeGreaterThanInput() {
        System.out.println("Enter size: ");
        int size = input.checkInputInt();
        System.out.println("Enter path: ");
        String path = input.checkInputString();

        File file = new File(path);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isFile() && (listFiles[i].length() / 1024) > size) {
                    System.out.println(listFiles[i].getName());
                }
            }
        } else if (file.exists() && file.isFile() && (file.length() / 1024) > size) {
            System.out.println(file.getName());
        } else {
            System.out.println("Path doesn't exist");
            return;
        }
    }

    public void appendContentToFile() throws IOException {
        System.out.print("Enter content: ");
        String content = input.checkInputString();
        System.out.print("Enter path: ");
        String path = input.checkInputString();
        File file = new File(path);
        if (file.exists() && file.isFile()) {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(content);
            writer.close();
            System.out.println("Write done");
        } else {
            System.out.println("Path doesn't exist");
        }
    }

    public void countCharacter() throws FileNotFoundException, IOException {
        System.out.print("Enter path: ");
        String path = input.checkInputString();
        File file = new File(path);
        if (file.exists() && file.isFile()) {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            int count = 0;
            while (line != null) {
                String[] parts = line.split(" ");
                for (String w : parts) {
                    count++;
                }
                line = reader.readLine();
            }
            System.out.println("Total: " + count);
        } else {
            System.out.println("Path doesn't exist");
        }
    }
}
