package com.example.JustGoOut.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private Long userId;
    private String userName;
    private String userEmail;
    //    private String userPasswordHash;
    private String userProfilePicture;
}
