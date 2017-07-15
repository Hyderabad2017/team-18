package com.example.pothi.uwh18.Common;

/**
 * Created by pothi on 15-07-2017.
 */

public class Person {
    String userName,userStatus,userLastSeenDate;
    int profilePic;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (profilePic != person.profilePic) return false;
        if (!userName.equals(person.userName)) return false;
        if (!userStatus.equals(person.userStatus)) return false;
        return userLastSeenDate.equals(person.userLastSeenDate);

    }

    @Override
    public int hashCode() {
        int result = userName.hashCode();
        result = 31 * result + userStatus.hashCode();
        result = 31 * result + userLastSeenDate.hashCode();
        result = 31 * result + profilePic;
        return result;
    }

    public Person(String userName) {
        this.userName = userName;
    }

    public Person() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserLastSeenDate() {
        return userLastSeenDate;
    }

    public void setUserLastSeenDate(String userLastSeenDate) {
        this.userLastSeenDate = userLastSeenDate;
    }

    public int getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(int profilePic) {
        this.profilePic = profilePic;
    }
}
