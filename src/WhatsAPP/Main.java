package WhatsAPP;

import WhatsAPP.Clases.Person;
import WhatsAPP.Clases.User;
import WhatsAPP.Clases.WhatsAPP;
import WhatsAPP.Service.Impl.UserImpl;
import WhatsAPP.Service.Impl.PersonImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonImpl person = new PersonImpl();
        UserImpl user = new UserImpl();
        while (true) {
            System.out.print("""
                    >>>>>>>>>> COMMANDS <<<<<<<<<<
                    1. - Get all passports
                    2. - Get passport by first name
                    3. - Get all WhatsApp Users
                    4. - Go to your profile
                    5. - Get all countries
                    6. - Get WhatsApp Status
                    7. - Create passport
                    8. - Install WhatsApp
                    9. - Change Status
                    10. - Add contact
                    11. - Send Message
                    12. See Status
                                        
                    Write a command :\040""");


            Scanner scanner =new Scanner(System.in);
            System.out.println("Input numbers");
            int number= scanner.nextInt();

            while (true){
                switch (number){
                    case 1:
                        System.out.println(person.getAllPassport());
                        break;
                    case 2:
                    String nm = scanner.nextLine();
                    System.out.print("FIRST NAME : ");
                    String firstName2 = scanner.nextLine();
                    System.out.println(person.getPersonByName(firstName2, person.getPersonByName(scanner.nextLine(),)));
                    break;
                    case 3:
                        System.out.println(person.getAllPassport());
                        break;
                    case 4:
                        System.out.println(user.getProfile());
                        break;
                    case 5:
                        System.out.println(user.getAllCountries());
                        break;
                    case 6:
                        System.out.println(user.getWhatsAppStatus());
                        break;
                    case 7:
                        System.out.println(user.getAllWhatsAppUsers());
                        break;
                    case 8:
                        System.out.println(user.changeStatus());
                        break;
                    case 9:
                        System.out.println(user.addContact(user,WhatsAPP));
                        break;
                    case 10:
                        System.out.println(user.sendMessage(user,WhatsAPP));
                }
            }


        }
    }
}