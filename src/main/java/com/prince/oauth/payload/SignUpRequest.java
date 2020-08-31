package com.prince.oauth.payload;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SignUpRequest implements Serializable {
    @NotBlank
    @Size(min = 4, max = 40, message = "name length should be between 4 to 40")
    private String name;

    @NotBlank
    @Size(min = 3, max = 15, message = "username length should be between 3 to 15")
    private String username;

    @NotBlank
    @Size(max = 40, message = "email length can't exceed 40")
    @Email(regexp = ".+@.+\\..+")
    private String email;

    @NotBlank
    @Size(min = 6, max = 20, message = "password length should be between 6 to 20")
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}