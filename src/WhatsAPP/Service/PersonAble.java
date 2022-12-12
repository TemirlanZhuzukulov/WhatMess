package WhatsAPP.Service;


import WhatsAPP.Clases.Person;
import WhatsAPP.Clases.User;

import java.util.List;

public interface PersonAble {
    List<Person>getAllPassport();
    Person getPersonByName(String name,List<Person>people);

}
