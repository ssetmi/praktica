package org.example;

import java.util.Date;

public class User {

    private int id;
    String login;
    String registrationDate;
    String email;
    int messagesCount;

    public User(int id, String login, String registrationDate, String email, int messagesCount) {
        this.id = id;
        this.login = login;
        this.registrationDate = registrationDate;
        this.email = email;
        this.messagesCount = messagesCount;
    }
    public User (){
        id=0;
        login="login";
        registrationDate="15.02.2003";
        email="adress@mail.ru";
        messagesCount=1;
    }

    @Override
    public String toString() {
        return "id: " + id + '\n' +
                "логин: " + login +'\n' +
                "дата регистрации: "+ registrationDate +'\n' +
                "email: "+ email + '\n' +
                "кол-во сообщений:: "+ messagesCount + '\n';
    }



    public void add_message(int new_message){
        messagesCount+=new_message;
    }
    public void minus_message(int delete_message){
        messagesCount-=delete_message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMessagesCount() {
        return messagesCount;
    }

    public void setMessagesCount(int messagesCount) {
        this.messagesCount = messagesCount;
    }
}
