package TranHoangViet_DE180482_SE18D10_week2.contactmanagementprogram.View;

public class Menu {
    InputValid input = new InputValid();
    String[] menu = {
            "                       Menu",
            "====================================================",
            "1. Add a contact ",
            "2. Display all contacts",
            "3. Delete a contact",
            "4. Exit ",

    };

    public int menu() {
        for (String temp : menu) {
            System.out.println(temp);
        }
        System.out.println("Enter your choice: ");
        int result = input.checkLimitInput(1, 4);
        return result;
    }
}
