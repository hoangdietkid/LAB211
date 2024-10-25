package TranHoangViet_DE180482_SE18D10_week8.buildingmodulecsvfileformat.Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import TranHoangViet_DE180482_SE18D10_week8.buildingmodulecsvfileformat.View.InputValid;

public class ManagePerson {
    public PersonList personList = new PersonList();
    public static InputValid input = new InputValid();

    public void importFileCsv(String pathName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(pathName));
            String line;
            while ((line = br.readLine()) != null) {
                String[] pr = line.split(",");
                if (pr.length == 5) {
                    int id = Integer.parseInt(pr[0]);
                    String name = pr[1];
                    String email = pr[2];
                    String phone = pr[3];
                    String address = pr[4];
                    personList.addPerson(new Person(id, name, email, phone, address));
                } else {
                    continue;
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void importFile() {
        System.out.println("--------- Import CSV ------- ");
        System.out.println("Enter Path: ");
        while (true) {
            String pathfile = input.checkInputString();
            File f = new File(pathfile);
            if (f.isFile()) {
                importFileCsv(pathfile);
                System.out.println("Done");
                return;
            } else {
                System.out.println("Is not file");
                System.out.println("Enter file path again: ");
            }
        }
    }

    public void formatName() {
        System.out.println("--------- Format Name -------");
        for (Person p : personList.getPersonList()) {
            String name = p.getName().replaceAll("\\s+", " ");
            String[] strName = name.split(" ");
            for (int i = 0; i < strName.length; i++) {
                strName[i] = strName[i].substring(0, 1).toUpperCase() + strName[i].substring(1);
            }
            String namef = "";
            for (String string : strName) {
                namef += string + " ";
            }
            p.setName(namef.trim());
        }
        System.out.println("Format: Done");
    }

    public void formatAddress() {
        System.out.println("--------- Format Address -------");
        for (Person p : personList.getPersonList()) {
            p.setAddress(p.getAddress().replaceAll("\\s+", " "));
        }
        System.out.println("Format: Done");
    }

    public void readFileCsv(String pathName) {
        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter(pathName));
            for (Person p : personList.getPersonList()) {
                bf.write(p.toString());
                bf.newLine();
            }
            bf.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void exportFile() {
        System.out.println("------- Export CSV ------ ");
        System.out.println("Enter Path: ");
        while (true) {
            String pathfile = input.checkInputString();
            File f = new File(pathfile);
            if (f.isFile()) {
                readFileCsv(pathfile);
                System.out.println("Done");
                return;
            } else {
                System.out.println("Is not file");
                System.out.println("Enter file path again: ");
            }
        }
    }
}
