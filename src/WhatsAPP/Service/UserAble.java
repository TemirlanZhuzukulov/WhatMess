package WhatsAPP.Service;

import WhatsAPP.Clases.Person;
import WhatsAPP.Clases.Profile;
import WhatsAPP.Clases.User;
import WhatsAPP.Clases.WhatsAPP;
import WhatsAPP.Enums.Country;
import WhatsAPP.Enums.Status;

import java.util.List;

public interface UserAble {
    List<User>getWhatsappAllUser();
    Profile getProfile();
    List<Country> getAllCountries();
    List<Profile> getAllWhatsAppUsers();
    String createWhatsappAccount(User Users,List<Person>people);
    String installWhatsApp(List<WhatsAPP> users);
    String changeStatus();
    String addContact(List<WhatsAPP> users, WhatsAPP myUser);
    String sendMessage (List<WhatsAPP> users, WhatsAPP myUser);
    Status getWhatsAppStatus();



}


