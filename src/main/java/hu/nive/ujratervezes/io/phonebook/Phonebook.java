package hu.nive.ujratervezes.io.phonebook;

import java.io.FileWriter;
import java.util.Map;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output) {
        if (contacts == null || output == null) {
            throw new IllegalArgumentException();
        }
        try {
            FileWriter fileOut = new FileWriter(output);
            for (Map.Entry<String, String> phoneEntry : contacts.entrySet()) {
                fileOut.write(phoneEntry.getKey() + ": " + phoneEntry.getValue() + System.lineSeparator());
            }
            fileOut.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}