package org.example;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserList {
    private List<User> users;

    public UserList() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void saveToFile(String filename) throws IOException {
        Gson gson = new Gson();
        FileWriter writer = new FileWriter(filename);
        gson.toJson(users, writer);
        writer.close();
    }

    public void loadFromFile(String filename) throws IOException {
        Gson gson = new Gson();
        FileReader reader = new FileReader(filename);
        User[] userList = gson.fromJson(reader, User[].class);
        users.clear();
        for (User user : userList) {
            users.add(user);
        }
        reader.close();
    }
}

