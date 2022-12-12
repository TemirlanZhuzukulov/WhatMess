package WhatsAPP.Service.Impl;

import WhatsAPP.Clases.*;
import WhatsAPP.Enums.Country;
import WhatsAPP.Enums.Status;
import WhatsAPP.Service.UserAble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserImpl implements UserAble {
    List<User> users = new ArrayList<>();

    @Override
    public List<User> getWhatsappAllUser() {
        return this.getWhatsappAllUser();
    }


    @Override
    public Profile getProfile() {
        System.out.print("Enter your username : ");
        String username = new Scanner(System.in).nextLine().toLowerCase();
        System.out.print("Enter your password : ");
        String password = new Scanner(System.in).nextLine();

        Profile[] profileList = new Profile[0];
        for (Profile profile : profileList) {
            if (profile.getUserName().equals(username) && profile.getPassword().equals(password))
                return profile;
        }


        return null;
    }


    @Override
    public List<Country> getAllCountries() {
        return List.of(Country.values());
    }

    @Override
    public List<Profile> getAllWhatsAppUsers() {
        return this.getAllWhatsAppUsers();

    }

    @Override
    public String createWhatsappAccount(User Users, List<Person> people) {
        if (Users.getId() != 0) {
            this.users.add(Users);
            return "УСПЕШНО!!!";
        } else {
            return "АКАУНТ НЕ СОЗДАН!!!";
        }

    }

    @Override
    public String installWhatsApp(List<WhatsAPP> users) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("name user: ");
        String userName = scanner.nextLine();
        System.out.print("password: ");
        String password = scanner.nextLine();
        users.add(new WhatsAPP(phoneNumber, userName, password));
        return "WhatsApp successfully installed!";
    }

    @Override
    public String changeStatus() {
        System.out.print("Enter your username : ");
        String username = new Scanner(System.in).nextLine().toLowerCase();
        System.out.print("Enter your password : ");
        String password = new Scanner(System.in).nextLine();
        boolean isLoggedIn = false;

        Profile[] profileList = new Profile[0];
        for (Profile profile : profileList) {
            if (profile.getUserName().equals(username) && profile.getPassword().equals(password)) {
                isLoggedIn = true;
                System.out.println("STATUS LIST : " + Arrays.toString(Status.values()));
                System.out.print("Enter your status index : ");
                int index = new Scanner(System.in).nextInt();
                profile.setStatus(Status.values()[index]);
                break;
            }
        }
        return "Profile status UPDATED successfully!";
    }


    @Override
    public String addContact(List<WhatsAPP> users, WhatsAPP myUser) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Телефон номер жазыныз: ");
        String phoneNumber = scanner.nextLine();
        for (WhatsAPP user : users) {
            if (phoneNumber.trim().equals(user.getPhoneNumber())) {
                System.out.println("Контакт табылды: " + user.getUserName());
                System.out.println("Сактоо? (yes/no)");
                String save = scanner.nextLine();
                if (save.trim().toUpperCase().equals("YES")){
                    System.out.println("Контакт ийгиликтуу кошулду!");

                }
            }
        }
        return "";
    }

    @Override
    public String sendMessage(List<WhatsAPP> users, WhatsAPP myUser) {
        return null;
    }

    @Override
    public String getMessage(List<WhatsAPP> users, WhatsAPP myUser) {
        Scanner scanner = new Scanner(System.in);
        String message = "";
        System.out.println("Кимге кат жонотосуз? ");
        String userName = scanner.nextLine();
        for (Contact myContact : myUser.()) {

            if (userName.equals(myUser.getName())){
                System.out.println("Контакт " + myContact.() + " табылды");
                while (true){
                    Scanner scanner1 = new Scanner(System.in);
                    Scanner scanner2 = new Scanner(System.in);

                    message = myUser.getUserName() + ": " + scanner1.nextLine();
                    System.out.println("Жонотуу (yes/no)?");
                    String yesOrNo = scanner2.nextLine();
                    if (yesOrNo.trim().toLowerCase().equals("yes")){
                        myContact.getMessages().add(message);
                        for (WhatsAPP user : users) {
                            if (user.getContacts() != null){
                                for (Contact contact : myContact) {
                                    if (contact.getPhoneNumber().trim().equals(myUser.getPhoneNumber())){
                                        for (Contact myContacty : myUser.getContacts()) {
                                            if (user.getPhoneNumber().trim().equals(myContacty.getPhoneNumber())){
                                                contact.getMessages().add(message);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }else {
                        break;
                    }
                }
            }
        }
        return message;
    }


    @Override
    public Status getWhatsAppStatus() {

        return null;
    }
}
