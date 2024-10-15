package TranHoangViet_DE180482_SE18D10_week6.handlefileprogram;

public class Menu {
    InputValid input = new InputValid();
    String[] menu = {
            "===== File Processing====\r\n" + //
                    "1. Check Path\r\n" + //
                    "2. Get file name with type java\r\n" + //
                    "3. Get file with size greater than input\r\n" + //
                    "4. Write more content to file\r\n" + //
                    "5. Read file and count characters\r\n" + //
                    "6. Exit"
    };

    public int menu() {
        for (String temp : menu) {
            System.out.println(temp);
        }
        System.out.println("Enter your choice: ");
        int result = input.checkLimitInput(1, 6);
        return result;
    }
}
