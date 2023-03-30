package com.example.userdatabase;

import android.widget.RadioGroup;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String degreeProgram;

    private int image;

    public static int userCounter = 0;

    private ArrayList<String> degrees;

    public User(String firstName, String lastName, String email, String degreeProgram, int image, ArrayList degrees ) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.email = email;
         this.degreeProgram = degreeProgram;
         this.image = image;
         this.degrees = degrees;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public int getImage() {
        return image;
    }

    public ArrayList<String> getDegrees() {
        return degrees;
    }
}
