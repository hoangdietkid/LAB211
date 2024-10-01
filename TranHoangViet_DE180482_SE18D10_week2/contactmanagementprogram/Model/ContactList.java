package TranHoangViet_DE180482_SE18D10_week2.contactmanagementprogram.Model;

import java.util.ArrayList;

public class ContactList {
    private ArrayList<Contact> listContact = new ArrayList<>();

    public ArrayList<Contact> getListContact() {
        return listContact;
    }

    public void setListContact(ArrayList<Contact> listContact) {
        this.listContact = listContact;
    }

    public void addContact(Contact contact) {
        listContact.add(contact);
    }

    public void deleteContact(Contact contact) {
        listContact.remove(contact);
    }
}
