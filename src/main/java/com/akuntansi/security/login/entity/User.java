package com.akuntansi.security.login.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class User {

    @NotEmpty(message = "Please Enter your username !")
    private String username;

    @NotEmpty(message = "Please provide your first name")
    private String firstName;

    @NotEmpty(message = "Please provide your last name")
    private String lastName;

    @NotEmpty(message = "Please provide your password!")
    private String password;

    @Email
    @NotNull(message = "Please enter an email")
    private String email;
}
