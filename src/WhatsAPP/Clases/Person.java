package WhatsAPP.Clases;


import WhatsAPP.Enums.Country;
import WhatsAPP.Enums.Status;

import java.time.LocalDate;

public class Person {
 private  String name;
 private  long id;
 private LocalDate age;
 private  int phoneNumber;
 private Status status;
 private Country country;

    public Person(String name, long id, LocalDate age, int phoneNumber, Status status, Country country) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getAge() {
        return age;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "\nPerson1{" +
                "\nname='" + name + '\'' +
                "\n, id=" + id +
                "\n, age=" + age +
                "\n, phoneNumber=" + phoneNumber +
                '}';
    }
}
