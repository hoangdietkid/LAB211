package TranHoangViet_DE180482_SE18D10_week2.managethegeographic.View;

public class Menu {
    InputValid input = new InputValid();
    String[] menu = {
            "                           Menu",
            "=========================================================",
            "1. Input the information of 1 countries in East Asia",
            "2. Display the information of country you've just input",
            "3. Search the information of country by user-entered name",
            "4. Display the information of countries sorted name in ascending",
            "5. Exit"
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
