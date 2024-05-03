package com.Interfile.intercafe.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Table
@Setter
public class UserEntity  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String email;
    @Column
    private String firstname;
    @Column
    private boolean isenabled;
    @Column
    private String lastname;
    @Column
    private String password;
    @Column
    private String role;

    public UserEntity(int id, String email, String firstname, boolean isenabled, String lastname, String password, String role) {
        this.id = id;
        this.email = email;
        this.firstname = firstname;
        this.isenabled = isenabled;
        this.lastname = lastname;
        this.password = password;
        this.role = role;
    }

    public UserEntity() {

    }

}
