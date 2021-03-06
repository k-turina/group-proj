package com.example.challengeup.backend;

import java.util.ArrayList;

public class Validation {
    public static boolean validateUserTagToBeUnique(String tag) throws IllegalArgumentException {
        ArrayList<UserEntity> users = UserEntity.getAllUsers();
        if (users.stream().anyMatch(x -> x.getTag().equals(tag)))
            throw new IllegalArgumentException("tag is not unique");
        return true;
    }

    public static boolean validateName(String name) throws IllegalArgumentException {
        if (name == null) throw new IllegalArgumentException("name can`t be null");
        if (name.equals("")) throw new IllegalArgumentException("name can`t be empty");
        if (name.length() >= 64)
            throw new IllegalArgumentException("name can`t be more than 63 symbols");
        return true;
    }

    public static boolean validateDescription(String description) throws IllegalArgumentException {
        if (description == null) throw new IllegalArgumentException("description can`t be null");
        if (description.equals(""))
            throw new IllegalArgumentException("description can`t be empty");
        if (description.length() >= 128)
            throw new IllegalArgumentException("description can`t be more than 127 symbols");
        return true;
    }

    public static boolean validateTask(String task) throws IllegalArgumentException {
        if (task == null) throw new IllegalArgumentException("task can`t be null");
        if (task.equals("")) throw new IllegalArgumentException("task can`t be empty");
        return true;
    }

    public static boolean validateTags(ArrayList<String> tags) throws IllegalArgumentException {
        if (tags == null) throw new IllegalArgumentException("tags can`t be null");
        if (tags.size() > 5) throw new IllegalArgumentException("tags number must be less than 6");
        return true;
    }

    public static boolean validateNick(String nick) throws IllegalArgumentException {
        if (nick == null) throw new IllegalArgumentException("nick can`t be null");
        if (!nick.matches("[A-Za-z0-9_\\- ]{5}[A-Za-z0-9_\\- ]*"))
            throw new IllegalArgumentException("wrong nick");
        return true;
    }
    public static boolean validateTag(String nick) throws IllegalArgumentException {
        if (nick == null) throw new IllegalArgumentException("tag can`t be null");
        if (!nick.matches("[A-Za-z0-9_\\-]{5}[A-Za-z0-9_\\-]*"))
            throw new IllegalArgumentException("wrong tag");
        return true;
    }
    public static boolean validatePassword(String nick) throws IllegalArgumentException {
        if (nick == null) throw new IllegalArgumentException("password can`t be null");
        if (!nick.matches("[A-Za-z0-9_\\-]{5}[A-Za-z0-9_\\-]*"))
            throw new IllegalArgumentException("wrong password");
        return true;
    }

    public static boolean validateEmail(String email) throws IllegalArgumentException {
        if (email == null) throw new IllegalArgumentException("email can`t be null");
        if (!email.matches("[A-Za-z0-9_\\-]+@[A-Za-z0-9]+[A-Za-z0-9.]*[A-Za-z0-9].[A-Za-z0-9]+"))
            throw new IllegalArgumentException("wrong email");
        return true;
    }

}
