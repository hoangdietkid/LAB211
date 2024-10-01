package TranHoangViet_DE180482_SE18D10_week2.managedoctor.View;

public class Menu {
    InputValid input = new InputValid();
    String[] menu = {
            "                       Menu",
            "====================================================",
            "1. Add doctor ",
            "2. Update doctor",
            "3. Delete doctor",
            "4. Search doctor",
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
