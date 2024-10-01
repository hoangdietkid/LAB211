package TranHoangViet_DE180482_SE18D10_week2.contactmanagementprogram.View;

import java.util.ArrayList;

import TranHoangViet_DE180482_SE18D10_week2.contactmanagementprogram.Model.Contact;
import TranHoangViet_DE180482_SE18D10_week2.contactmanagementprogram.Model.ContactList;

public class ManageContact {
    ContactList contactList = new ContactList();
    InputValid input = new InputValid();
    private int id = 1;

    public void addContact() {
        while (true) {
            System.out.println("-----------Add a Contact-----------");
            System.out.println("Enter fisrt name: ");
            String firstName = input.checkInputString();
            System.out.println("Enter last name: ");
            String lastName = input.checkInputString();
            System.out.println("Enter group: ");
            String group = input.checkInputString();
            System.out.println("Enter address: ");
            String address = input.checkInputString();
            System.out.println("Enter Phone: ");
            String phone = input.checkInputPhone();
            String fullName = firstName + " " + lastName;
            Contact temp = new Contact(id++, fullName, firstName, lastName, group, address, phone);
            contactList.addContact(temp);
            System.out.println("Successful");
            boolean check = input.checkInputYN();
            if (check) {
                return;
            }
        }
    }

    public void display() {
        ArrayList<Contact> list = contactList.getListContact();
        if (list.isEmpty()) {
            System.out.println("No contact!!");
            return;
        }
        System.out.println("-------------------------------- Display all Contact ----------------------------");
        System.out.printf("%-5s%-25s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Name",
                "First name", "Last name", "Group", "Address", "Phone");

        for (Contact c : list) {
            System.out.printf("%-5s%-25s%-20s%-20s%-20s%-20s%-20s\n", c.getId(), c.getFullName(), c.getFirstName(),
                    c.getLastName(), c.getGroup(), c.getAddress(), c.getPhone());
        }
    }

    public void delContact() {
        System.out.println("Enter id");
        int id = input.checkInputInt();
        Contact contacted = getContactById(id);
        if (contacted == null) {
            System.err.println("not found contact!");
            return;
        } else {
            contactList.deleteContact(contacted);
            resetContactId();
            System.out.println("Delete successful.");
        }
    }

    public Contact getContactById(int id) {
        for (Contact contact : contactList.getListContact()) {
            if (contact.getId() == id) {
                return contact;
            }
        }
        return null;
    }

    public void resetContactId() {
        ArrayList<Contact> list = contactList.getListContact();
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setId(i + 1);
        }
        id = list.size() + 1;
    }
}
