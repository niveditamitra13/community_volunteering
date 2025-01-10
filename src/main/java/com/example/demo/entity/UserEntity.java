package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userType;
    private String userName;
    private String userPhoneNo;
    private String password;
    private String userEmail;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }


    public String getUserType() {
        return userType;
    }
    public void setUserType(String userType) {
        this.userType= userType;
    }



    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getUserPhoneNo() {
        return userPhoneNo;
    }
    public void setUserPhoneNo(String userPhoneNo) {
        this.userPhoneNo= userPhoneNo;
    }




    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail= userEmail;
    }




    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;

    }

}






