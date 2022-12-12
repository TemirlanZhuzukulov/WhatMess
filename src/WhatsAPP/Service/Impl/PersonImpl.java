package WhatsAPP.Service.Impl;

import WhatsAPP.Clases.Person;
import WhatsAPP.Service.PersonAble;

import java.util.ArrayList;
import java.util.List;

public class PersonImpl implements PersonAble {
    List<Person>people = new ArrayList<>();
    @Override
    public List<Person> getAllPassport() {
        return people;
    }

    @Override
    public Person getPersonByName(String name, List<Person> people) {
        for (Person person : people) {
            if (person.getName().equals(name)) {
                return person;
            }

        }
        return null;
    }
}

