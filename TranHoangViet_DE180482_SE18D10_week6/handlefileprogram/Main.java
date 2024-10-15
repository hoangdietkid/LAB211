package TranHoangViet_DE180482_SE18D10_week6.handlefileprogram;

import java.io.IOException;

public class Main {
    public static Menu menu = new Menu();
    public static Handlefile handlefile = new Handlefile();

    public static void main(String[] args) throws IOException {
        while (true) {
            int choice = menu.menu();
            switch (choice) {
                case 1:
                    handlefile.checkInputPath();
                    break;
                case 2:
                    handlefile.getAllFileNameJavaInDirectory();
                    break;
                case 3:
                    handlefile.getFileWithSizeGreaterThanInput();
                    break;
                case 4:
                    handlefile.appendContentToFile();
                    break;
                case 5:
                    handlefile.countCharacter();
                    break;
                case 6:
                    System.exit(0);
                    break;

            }
        }
    }
}
