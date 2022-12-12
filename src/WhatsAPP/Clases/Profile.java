package WhatsAPP.Clases;

import WhatsAPP.Enums.Status;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Profile {
    private long id;
    private String userName;
    private String password;
    private List<String> messages ;
    private Status status;
    private String phoneNumber;
    private Map<String,Integer> chatPeople = new TreeMap<>();

    public Profile(long id, String userName, String password, List<String> messages, Status status, String phoneNumber, Map<String, Integer> chatPeople) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.messages = messages;
        this.status = status;
        this.phoneNumber = phoneNumber;
        this.chatPeople = chatPeople;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Map<String, Integer> getChatPeople() {
        return chatPeople;
    }

    public void setChatPeople(Map<String, Integer> chatPeople) {
        this.chatPeople = chatPeople;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", messages=" + messages +
                ", status=" + status +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", chatPeople=" + chatPeople +
                '}';
    }
}
