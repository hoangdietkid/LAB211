package TranHoangViet_DE180482_SE18D10_week3.analyzefilepath_;

import java.io.File;
import java.util.Scanner;

public class AnalyzeFilePath {
    public static final Scanner scanner = new Scanner(System.in);

    public static String checkInputString() {
        while (true) {
            String result = scanner.nextLine();
            if (result.isEmpty() || result.startsWith(" ")) {
                System.err.println("Is empty");
                System.out.println("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public static String checkInputPath() {
        while (true) {
            System.out.println("Please input path: ");
            String path = checkInputString();
            File file = new File(path);
            if (file.exists() && file.isFile()) {
                return path;
            } else {
                System.err.println("Path isn't file.");
                System.out.println("Enter again!");
            }
        }
    }

    private static String getDisk(String path) {
        int positionColon = path.indexOf("\\");
        return path.substring(0, positionColon);
    }

    private static String getExtension(String path) {
        int positionDot = path.lastIndexOf(".");
        return path.substring(positionDot + 1, path.length());
    }

    private static String getFileName(String path) {
        int positionFrom = path.lastIndexOf("\\");
        int positionTo = path.lastIndexOf(".");
        return path.substring(positionFrom + 1, positionTo);
    }

    private static String getPath(String path) {
        int fromDisk = path.indexOf("\\");
        int toNameFile = path.lastIndexOf("\\");
        return path.substring(fromDisk + 1, toNameFile);
    }

    private static String getFolder(String path) {
        int positionColon = path.indexOf("\\");
        int positionDot = path.lastIndexOf("\\");
        path = path.substring(positionColon, positionDot);
        String[] splitFile = path.split("\\\\");
        return splitFile[splitFile.length - 1];
    }

    public static void main(String[] args) {
        String path = checkInputPath();
        System.out.println("Disk: " + getDisk(path));
        System.out.println("Extension: " + getExtension(path));
        System.out.println("File name: " + getFileName(path));
        System.out.println("Path: " + getPath(path));
        System.out.println("Folders: " + getFolder(path));
    }
}
