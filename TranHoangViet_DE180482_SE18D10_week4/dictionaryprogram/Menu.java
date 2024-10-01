package TranHoangViet_DE180482_SE18D10_week4.dictionaryprogram;

public class Menu {
    InputValid input = new InputValid();
    String[] menu = {
            "                           Menu",
            "=========================================================",
            "1. Add word",
            "2. Delete word",
            "3. Translate",
            "4. Exit"
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
