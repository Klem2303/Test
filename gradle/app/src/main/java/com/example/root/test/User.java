package com.example.root.test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("age")
    @Expose
    private int age;
    @SerializedName("avatar")
    @Expose
    private String avatar;
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("lastSeen")
    @Expose
    private String lastSeen;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("similarity")
    @Expose
    private int similarity;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("unreadMessages")
    @Expose
    private int unreadMessages;

    /**
     * No args constructor for use in serialization
     *
     */
    public User() {
    }

    /**
     *
     * @param id
     * @param unreadMessages
     * @param lastSeen
     * @param status
     * @param name
     * @param age
     * @param similarity
     * @param avatar
     */
    public User(int age, String avatar, int id, String lastSeen, String name, int similarity, String status, int unreadMessages) {
        super();
        this.age = age;
        this.avatar = avatar;
        this.id = id;
        this.lastSeen = lastSeen;
        this.name = name;
        this.similarity = similarity;
        this.status = status;
        this.unreadMessages = unreadMessages;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(String lastSeen) {
        this.lastSeen = lastSeen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSimilarity() {
        return similarity;
    }

    public void setSimilarity(int similarity) {
        this.similarity = similarity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getUnreadMessages() {
        return unreadMessages;
    }

    public void setUnreadMessages(int unreadMessages) {
        this.unreadMessages = unreadMessages;
    }

}
