package user;

import java.util.Arrays;

public class User {
    private int id, level, numExperience, solvedProblems, watchedClass[];
    private String name, password, photo;
    private User friends[];

    public User(int id, int level, int numExperience, int solvedProblems, int[] watchedClass, String name, String password, String photo, User[] friends) {
        this.id = id;
        this.level = level;
        this.numExperience = numExperience;
        this.solvedProblems = solvedProblems;
        this.watchedClass = this.watchedClass;
        this.name = name;
        this.password = password;
        this.photo = photo;
        this.friends = this.friends;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }
    
    public void levelUp() {
        this.level = this.level + 1;
    }

    public int getNumExperience() {
        return numExperience;
    }
    
    public void setNumExperience(int numExperience) {
        this.numExperience = numExperience;
    }

    public int getSolvedProblems() {
        return solvedProblems;
    }
    
    public void addSolvedProblems(int solvedProblems) {
        this.solvedProblems = this.solvedProblems + solvedProblems;
    }

    public int[] getWatchedClass() {
        return watchedClass;
    }
    
    public void setWatchedClass(int[] watchedClass) {
        this.watchedClass = watchedClass;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }
    
    public void resetPassword(String newPassword) {
        this.password = newPassword;
    }

    public String getPhoto() {
        return photo;
    }
    
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public User[] getFriends() {
        return friends;
    }
    
    public void setFriends(User[] friends) {
        this.friends = friends;
    }
    
    public int getNumFriends(){
        return friends.length;
    }
}
