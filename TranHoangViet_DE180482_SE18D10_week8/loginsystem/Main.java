package TranHoangViet_DE180482_SE18D10_week8.loginsystem;

import java.util.Locale;

public class Main {
    public static Menu menu = new Menu();
    public static Loginfunc loginfunc = new Loginfunc();

    public static void main(String[] args) {
        Locale vn = new Locale("vn");
        Locale en = new Locale("en");
        while (true) {
            int choice = menu.menu();
            switch (choice) {
                case 1:
                    loginfunc.login(vn);
                    break;
                case 2:
                    loginfunc.login(en);
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }

    }
}
