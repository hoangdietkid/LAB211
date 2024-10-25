package TranHoangViet_DE180482_SE18D10_week8.buildingmodulecsvfileformat.Model;

import java.util.ArrayList;

public class PersonList {
    ArrayList<Person> personList = new ArrayList<>();

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public void addPerson(Person person) {
        personList.add(person);
    }

}
