package TranHoangViet_DE180482_SE18D10_week8.loginsystem;

import java.util.Locale;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Loginfunc {
    private Locale locale;
    public static Scanner scanner = new Scanner(System.in);

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public String getMessString(String key) {
        ResourceBundle bundle = ResourceBundle.getBundle("mess", locale);
        String mess = bundle.getString(key);
        return mess;
    }

    public void login(Locale locale) {
        setLocale(locale);
        checkAccNumber();
        checkPass();
        checkCaptCha();
    }

    public String checkAccNumber() {
        String acc;
        while (true) {
            System.out.println(getMessString("acc"));
            acc = scanner.nextLine();
            if (acc.matches("^\\d{10}$")) {
                return acc;
            } else {
                System.out.println(getMessString("incAcc"));
            }
        }
    }

    public String checkPass() {
        String check = "^(?=.*?[a-z])(?=.*?[0-9]).{8,31}$";
        String pass;
        while (true) {
            System.out.println(getMessString("pass"));
            pass = scanner.nextLine();
            if (pass.matches(check)) {
                return pass;
            } else {
                System.out.println(getMessString("incPass"));
            }
        }
    }

    public String getCaptCha() {
        String alp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvxyz";
        String result = "";
        for (int i = 0; i < 5; i++) {
            int index;
            Random random = new Random();
            index = random.nextInt(alp.length());
            result += alp.charAt(index);
        }
        return result;
    }

    public void checkCaptCha() {
        String result;
        String captcha = getCaptCha();
        System.out.print(getMessString("captCha") + " " + captcha + "\n");
        while (true) {
            System.out.println(getMessString("inpCaptCha"));
            result = scanner.nextLine();
            if (result.equals(captcha)) {
                return;
            } else {
                System.out.println(getMessString("incCaptCha"));
            }
        }
    }
}
