package TranHoangViet_DE180482_SE18D10_week6.managecandidate.View;

public class Menu {
    InputValid input = new InputValid();
    String[] menu = {
            "CANDIDATE MANAGEMENT SYSTEM \r\n" + //
                    "1. Experience \r\n" + //
                    "2. Fresher \r\n" + //
                    "3. Internship \r\n" + //
                    "4. Searching \r\n" + //
                    "5. Exit"
    };
    String[] submenu = {
            "1. Create \r\n" + //
                    "2. Update \r\n" + //
                    "3. Delete \r\n" + //
                    "4. Exit"
    };

    public int menu() {
        for (String temp : menu) {
            System.out.println(temp);
        }
        System.out.println("Enter your choice: ");
        int result = input.checkLimitInput(1, 5);
        return result;
    }

    public int submenu() {
        for (String temp : submenu) {
            System.out.println(temp);
        }
        System.out.println("Enter your choice: ");
        int result = input.checkLimitInput(1, 4);
        return result;
    }

}
