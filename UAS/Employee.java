/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

/**
 *
 * @author Daffa
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class Employee {

    String firstname, lastname, id;

    char sex;

    Date dateBirth;

    Employee() {

    }

    Employee(String firstname, String lastname, String id, char sex, Date dateBirth) {


        this.firstname = firstname;

        this.lastname = lastname;

        this.id = id;

        this.sex = sex;

        this.dateBirth = dateBirth;

    }

    public String toString() {
        SimpleDateFormat dateformat = new SimpleDateFormat("mm/dd/yy");


        String str = "ID Employee Number: " + id + "\nEmployee Name: "

                + firstname + " " + lastname + "\nBirth Date: "

                + dateformat.format(dateBirth);

        return str;

    }

    public String getFirstname() {

        return firstname;

    }

    public void setFirstname(String firstname) {

        this.firstname = firstname;

    }

    public String getLastname() {

        return lastname;

    }

    public void setLastname(String lastname) {

        this.lastname = lastname;

    }

    public String getId() {

        return id;

    }

    public void setId(String id) {

        this.id = id;

    }

    public char getSex() {

        return sex;

    }

    public void setSex(char sex) {

        this.sex = sex;

    }

    public Date getDob() {

        return dateBirth;

    }

    public void setDob(Date dateBirth) {

        this.dateBirth = dateBirth;

    }

    public abstract double monthlyEarning();

}
