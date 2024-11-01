package DE180482_TranHoangViet_SE18D10_LAB211_PE.View;

public class Menu {
    InputValid input = new InputValid();
    String[] temp = { "1. Add a new home appliance\n" +
            "2. Display all home appliances\n" + //
            "3. Update information of a home appliance\n" + //
            "4. Search home appliances\n" + //
            "5. Delete old home appliances\n" + "6. Exit."
    };

    public int menu() {
        for (String string : temp) {
            System.out.println(string);
        }
        System.out.println("Enter your choice: ");
        int choice = input.checkLimitInput(1, 6);
        return choice;
    }
}
