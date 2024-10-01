package TranHoangViet_DE180482_SE18D10_week3.manageworkerinformation.View;

public class Menu {
    InputValid input = new InputValid();
    String[] menu = {
            "                       Menu",
            "====================================================",
            "1. Add worker.",
            "2. Increase salary for worker.",
            "3. Decrease for worker.",
            "4. Show adjusted salary worker information.",
            "5. Exit ",

    };

    public int menu() {
        for (String temp : menu) {
            System.out.println(temp);
        }
        System.out.println("Enter your choice: ");
        int result = input.checkLimitInput(1, 5);
        return result;
    }
}
