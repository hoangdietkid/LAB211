package TranHoangViet_DE180482_SE18D10_week5.manageexpense.View;

public class Menu {
    InputValid input = new InputValid();
    String[] menu = {
            "                       Menu",
            "====================================================",
            "1. Add an expense.",
            "2. Delete an expense.",
            "3. Display all expenses.",
            "4. Quit",

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
