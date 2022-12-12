package WhatsAPP.Clases;

import WhatsAPP.Enums.Status;

public class WhatsAPP {
    private String phoneNumber;
    private String password;
    private String userName;
    private Status status ;

    public WhatsAPP(String phoneNumber, String password, String userName) {
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.userName = userName;
        this.status = status;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "\nWhatsAPP{" +
                "\nphoneNumber='" + phoneNumber + '\'' +
                "\n, password='" + password + '\'' +
                "\n, userName='" + userName + '\'' +
                "\n, status=" + status +
                '}';
    }


    public boolean getContact() {
    }
}
