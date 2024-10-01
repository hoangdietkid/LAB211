package TranHoangViet_DE180482_SE18D10_week4.checkdataformat;

public class Main {
    public static InputData input = new InputData();

    public static void main(String[] args) {
        System.out.print("Phone number: ");
        String phone = input.checkPhone();
        System.out.print("Date: ");
        String date = InputData.checkInputDate();
        System.out.print("Email: ");
        String email = input.checkInputEmail();
        System.out.println(phone);
        System.out.println(date);
        System.out.println(email);
    }
}
