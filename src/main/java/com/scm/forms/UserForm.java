package com.scm.forms;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class UserForm {

    @NotBlank(message = "Username is required")
    @Size(min = 3 ,message = "Minimum 3 Characters is required")
    private String name;
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid Email Address")
    private String email;
    @NotBlank(message = "Password is required")
    @Size(min = 8,message = "Minimum 8 Character is required")
    private String password;
    @NotBlank(message = "Invalid Phone Number")
    @Size(min = 11,message = "Invalid Contact Number")
    private String phoneNumber;
    private String about;

}
