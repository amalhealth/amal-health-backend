package com.amalhealthbackend.model;

import java.util.regex.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class User {
private long id;
private String name;
private String gender;
private String phoneNumber;
private String email;
private String profilePicture;
private String userName;
private String password;
public void setName(String name) throws Exception{
    if(name.length()<4)throw new Exception("Please specify correct name");
    else this.name=name;
}
public void setPhoneNUmber(String phoneNumber) throws Exception{
    String regex = "^[+]?\\d+$";
    Boolean result=Pattern.compile(regex).matcher(regex).matches();
    if(result&&phoneNumber.length()>9)this.phoneNumber=phoneNumber;
    else if(result&&phoneNumber.length()<9)throw new Exception("Phone number incomplete");
    else throw new Exception("invalid phone number");
}
public void setEmail(String email) throws Exception{
    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    boolean result=Pattern.compile(emailRegex).matcher(email).matches();
    if(result)this.email=email;
    else throw new Exception("Invalid email adress");
}
public void setPassword(String password) throws Exception{
    String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$";
    Boolean result=Pattern.compile(passwordRegex).matcher(password).matches();
    if(result)this.password=password;
    else throw new Exception("Password Requires at least one lowercase letter, one uppercase letter, one digit, one special character, and a minimum length of 8 characters");
}
}
