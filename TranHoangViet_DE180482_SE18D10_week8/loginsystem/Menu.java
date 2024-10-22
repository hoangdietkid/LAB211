package TranHoangViet_DE180482_SE18D10_week8.loginsystem;

public class Menu {
    InputValid input = new InputValid();
    String[] menu = {
            "-------Login Program------- \r\n" + //
                    "1. Vietnamese \r\n" + //
                    "2. English \r\n" + //
                    "3. Exit \r\n"

    };

    public int menu() {
        for (String temp : menu) {
            System.out.println(temp);
        }
        System.out.println("Enter your choice: ");
        int result = input.checkLimitInput(1, 3);
        return result;
    }
}
