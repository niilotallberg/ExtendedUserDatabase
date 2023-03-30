package com.example.userdatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserListAdapter extends RecyclerView.Adapter<UserViewHolder> {

    private Context context;
    private ArrayList<User> users;

    public UserListAdapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserViewHolder(LayoutInflater.from(context).inflate(R.layout.user_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        StringBuilder degreesStringBuilder = new StringBuilder();
        for (String degree : users.get(position).getDegrees()) {
            degreesStringBuilder.append(degree);
            degreesStringBuilder.append("\n");
        }
        if (users.get(position).getDegrees().size() == 0) {
            degreesStringBuilder.append("-");
        }
        String degreesAsString = degreesStringBuilder.toString();

        holder.Name.setText(users.get(position).getFirstName() + " " + users.get(position).getLastName());
        holder.degreeProgram.setText(users.get(position).getDegreeProgram());
        holder.email.setText(users.get(position).getEmail());
        holder.userImage.setImageResource(users.get(position).getImage());
        holder.degrees.setText(degreesAsString);

    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
