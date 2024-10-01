package TranHoangViet_DE180482_SE18D10_week3.manageperson.View;

import TranHoangViet_DE180482_SE18D10_week3.manageperson.Model.Person;

public class ManagePerson {
    public static InputValid input = new InputValid();

    public static void main(String[] args) {
        Person[] persons = new Person[3];
        System.out.println("=====Management Person programer=====");
        System.out.println("Input Information of Person");
        for (int i = 0; i < 3; i++) {
            persons[i] = inputPersonInfo();
        }
        persons = sortBySalary(persons);
        System.out.println("Information of Person you have entered: ");
        for (Person person : persons) {
            person.displayPersonInfo();
        }
    }

    public static Person inputPersonInfo() {
        String name;
        String address;
        double salary = 0;

        System.out.println("Please input name:");
        name = input.checkInputString();
        System.out.println("Please input address:");
        address = input.checkInputString();
        System.out.println("Please input salary:");
        salary = input.checkInputdouble();
        return new Person(name, address, salary);
    }

    public static Person[] sortBySalary(Person[] persons) {
        int n = persons.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (persons[j].getSalary() > persons[j + 1].getSalary()) {
                    Person temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
        return persons;
    }

}
