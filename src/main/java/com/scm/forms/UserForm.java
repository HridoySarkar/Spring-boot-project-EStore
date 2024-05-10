package com.scm.forms;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Entity
@ToString

public class UserForm {

    @Id
    private long id;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private String about;

}
