package TranHoangViet_DE180482_SE18D10_week8.buildingmodulecsvfileformat.View;

public class Menu {
    InputValid input = new InputValid();
    String[] menu = {
            "======= Format CSV Program ======= \r\n" + //
                    "1. Import CSV \r\n" + //
                    "2. Format Address \r\n" + //
                    "3. Format Name \r\n" + //
                    "4. Export CSV \r\n" + //
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
