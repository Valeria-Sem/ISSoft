package by.issoft.training.core.userInfo;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class User {

    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private final String passportNo;
    private String nationality;
    private Sex sex;

    public User(String name, String surname, LocalDate dateOfBirth, String passportNo, String nationality, Sex sex) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.passportNo = passportNo;
        this.nationality = nationality;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

}
