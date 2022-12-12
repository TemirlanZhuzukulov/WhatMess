package WhatsAPP.Clases;

import WhatsAPP.Enums.Country;
import WhatsAPP.Enums.Status;
import WhatsAPP.Service.UserAble;
import jdk.jshell.Snippet;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String phoneNumber;
    private String userName;
    private Status whatsappStatus;
    private String password;
    private int contact;
    private ArrayList<String> messages ;
    private List<Person> people;
    private List<Contact> contacts;

    public User(int contact) {
        this.contact = contact;
    }

    public int getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", userName='" + userName + '\'' +
                ", whatsappStatus=" + whatsappStatus +
                ", password='" + password + '\'' +
                ", contact=" + contact +
                ", messages=" + messages +
                ", people=" + people +
                ", contacts=" + contacts +
                '}';
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public User(List<Contact> contacts) {
        this.contacts = contacts;

    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public User(int id, String phoneNumber, String userName, Status whatsappStatus, String password, ArrayList<String> messages, List<Person> people) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.whatsappStatus = whatsappStatus;
        this.password = password;
        this.messages = messages;
        this.people = people;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Status getWhatsappStatus() {
        return whatsappStatus;
    }

    public void setWhatsappStatus(Status whatsappStatus) {
        this.whatsappStatus = whatsappStatus;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<String> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<String> messages) {
        this.messages = messages;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

}
