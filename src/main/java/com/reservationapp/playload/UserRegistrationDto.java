package com.reservationapp.playload;

import jakarta.persistence.Lob;

public class UserRegistrationDto {
    private long id;
    private String name;
    private   String email;
    private String password;

    private  byte[] profilePicture;
}
