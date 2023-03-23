package com.example.userdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import android.content.*;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class Activity extends AppCompatActivity {
    private EditText firstNameInput;
    private EditText lastNameInput;
    private EditText emailInput;

    private String firstName;

    private String lastName;

    private String email;

    private String degreeProgram;

    private RadioGroup rgPicture;

    private ImageView imageViewPhoto;

    private Integer []photos = { R.drawable.woman_png, R.drawable.man_png};

    private int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);
        this.imageViewPhoto = (ImageView) findViewById(R.id.ivSelection);
        this.rgPicture = (RadioGroup) findViewById(R.id.rgPicture);
        this.rgPicture.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton = (RadioButton) radioGroup.findViewById(i);
                int index = radioGroup.indexOfChild(radioButton);
                imageViewPhoto.setImageResource(photos[index]);

            }
        });

        firstNameInput = findViewById(R.id.etFirstName);
        lastNameInput = findViewById(R.id.etLastName);
        emailInput = findViewById(R.id.etEmail);
    }

    public void addUser(View view) {

        firstName = firstNameInput.getText().toString();
        lastName = lastNameInput.getText().toString();
        email = emailInput.getText().toString();

        rgPicture = findViewById(R.id.rgPicture);

        switch (rgPicture.getCheckedRadioButtonId()) {
            case R.id.rbWoman:
                image = R.drawable.woman_png;
                break;
            case R.id.rbMan:
                image = R.drawable.man_png;
                break;
        }

        RadioGroup rgUserType = findViewById(R.id.rgUserType);

        switch (rgUserType.getCheckedRadioButtonId()) {
            case R.id.rbTietotekniikka:
                degreeProgram = "Tietotekniikka";
                break;
            case R.id.rbTuotantotalous:
                degreeProgram = "Tuotantotalous";
                break;
            case R.id.rbLaskennallinentekniikka:
                degreeProgram = "Laskennallinen tekniikka";
                break;
            case R.id.rbSähkötekniikka:
                degreeProgram = "Sähkötekniikka";
                break;
        }
        UserStorage.getInstance().addUser(new User(firstName, lastName, email, degreeProgram, image));
    }

}