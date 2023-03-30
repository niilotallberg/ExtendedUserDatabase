package com.example.userdatabase;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    ImageView userImage;
    TextView Name, email, degreeProgram, degreesHeading, degrees;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        userImage = itemView.findViewById(R.id.ivUserImage);
        Name = itemView.findViewById(R.id.txtUserName);
        email = itemView.findViewById(R.id.txtEmail);
        degreeProgram = itemView.findViewById(R.id.txtProgram);
        degreesHeading = itemView.findViewById(R.id.txtDegreesHeading);
        degrees = itemView.findViewById(R.id.txtDegrees);
    }
}
