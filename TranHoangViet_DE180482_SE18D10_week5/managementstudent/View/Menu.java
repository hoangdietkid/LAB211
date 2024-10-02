package TranHoangViet_DE180482_SE18D10_week5.managementstudent.View;

public class Menu {
    InputValid input = new InputValid();
    String[] menu = {
            "1. Create\n" +
                    "2. Find and Sort\n" +
                    "3. Update/Delete\n" +
                    "4. Report\n" +
                    "5. Exit "
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
